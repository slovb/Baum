package com.slov.baum.objects.items;

import com.slov.baum.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MapleLeavesItem extends BlockNamedItem {

	public MapleLeavesItem() {
		super(ModBlocks.MAPLE_LEAVES.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
