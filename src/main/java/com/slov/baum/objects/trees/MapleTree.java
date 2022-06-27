package com.slov.baum.objects.trees;

import java.util.Random;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

public class MapleTree extends Tree {

	@Override
	protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
		return new MapleTreeFeature(NoFeatureConfig::deserialize, true, false);
	}

}
