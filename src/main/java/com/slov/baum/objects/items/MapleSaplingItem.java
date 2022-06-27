package com.slov.baum.objects.items;

import com.slov.baum.init.ModBlocks;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class MapleSaplingItem extends BlockNamedItem {

	public MapleSaplingItem() {
		super(ModBlocks.MAPLE_SAPLING.get(), new Item.Properties().group(ItemGroup.DECORATIONS));
	}
}
