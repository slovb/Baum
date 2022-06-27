package com.slov.baum;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.slov.baum.init.ModBlocks;
import com.slov.baum.init.ModItems;

@Mod(Baum.MODID)
public class Baum {
	public static final String MODID = "baum";

	// Directly reference a log4j logger.
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();

	public Baum() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.BLOCKS.register(bus);
		ModItems.ITEMS.register(bus);
	}
}
