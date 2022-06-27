package com.slov.baum.init;

import com.slov.baum.Baum;
import com.slov.baum.objects.blocks.MapleLeavesBlock;
import com.slov.baum.objects.blocks.MapleSaplingBlock;

import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Baum.MODID);

	public static final RegistryObject<Block> MAPLE_LEAVES = BLOCKS.register("maple_leaves", MapleLeavesBlock::new);
	public static final RegistryObject<Block> MAPLE_SAPLING = BLOCKS.register("maple_sapling", MapleSaplingBlock::new);
}
