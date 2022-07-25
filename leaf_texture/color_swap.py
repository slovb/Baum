import os
import sys

import numpy as np
from PIL import Image


def swap(data, color_from, color_to):
    red, green, blue = data[:,:,0], data[:,:,1], data[:,:,2]
    mask = (red == color_from[0]) & (green == color_from[1]) & (blue == color_from[2])
    data[:,:,:3][mask] = list(color_to)
    return data

def get_colors(im):
    color_set = set()
    for x in range(im.width):
        for y in range(im.height):
            color_set.add(im.getpixel((x, y)))
    colors = [c for c in list(color_set) if c[3] > 0]
    colors = [(r, g, b) for r,g,b,_ in colors]
    colors = sorted(colors, key=sum)
    return colors

def main(filename):
    im = Image.open(filename)

    data = np.array(im)

    color_from = get_colors(im)
    # color_from = [(85,83,85), (95,94,95), (117,118,117), (144,146,144)]
    # color_to = [(154,23,3), (193,34,12), (92,37,25), (198,44,17)]
    # color_to = [(92,37,25), (154,23,3), (193,34,12), (198,44,17)]
    dark = (85, 1, 0)
    light = (232, 37, 50)
    def tween(color):
        start = color_from[0]
        end = color_from[-1]
        factor = (sum(color) - sum(start)) / (sum(end) - sum(start))
        out = []
        for i in range(3):
            out.append(dark[i] + factor * (light[i] - dark[i]))
        return tuple([round(c) for c in out])
    color_to = [dark] + [tween(color) for color in color_from[1:-1]] + [light]
    print(color_to)
        
    for i in range(len(color_from)):
        data = swap(data, color_from[i], color_to[i])
    
    im = Image.fromarray(data)
    im.save(os.path.basename(filename))

if __name__ == '__main__':
    for folder in sys.argv[1:]:
        if folder == '':
            continue
        paths = [os.path.join(folder, filename) for filename in os.listdir(folder)]
        files = [path for path in paths if os.path.isfile(path) and path.endswith('.png')]
        for file in files:
            main(file)
