package com.slov.baum.objects.blocks;

import com.slov.baum.objects.trees.MapleTree;

import net.minecraft.block.Block;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MapleSaplingBlock extends SaplingBlock {

	public MapleSaplingBlock() {
		super(new MapleTree(), Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly()
				.hardnessAndResistance(0.0F).sound(SoundType.PLANT));
		this.setDefaultState(this.stateContainer.getBaseState());
	}
}
