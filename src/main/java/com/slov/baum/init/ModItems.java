package com.slov.baum.init;

import com.slov.baum.Baum;
import com.slov.baum.objects.items.MapleLeavesItem;
import com.slov.baum.objects.items.MapleSaplingItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Baum.MODID);

	public static final RegistryObject<Item> MAPLE_LEAVES = ITEMS.register("maple_leaves", MapleLeavesItem::new);
	public static final RegistryObject<Item> MAPLE_SAPLING = ITEMS.register("maple_sapling", MapleSaplingItem::new);
}
