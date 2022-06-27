package com.slov.baum.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MapleLeavesBlock extends LeavesBlock {

	public MapleLeavesBlock() {
		super(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly()
				.sound(SoundType.PLANT));
	}
}
