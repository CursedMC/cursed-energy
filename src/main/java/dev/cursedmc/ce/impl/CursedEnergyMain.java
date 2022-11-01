package dev.cursedmc.ce.impl;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CursedEnergyMain implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Cursed Energy");
	
	private CursedEnergyMain() {}
	
	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Initialized {}", mod.metadata().name());
	}
}
