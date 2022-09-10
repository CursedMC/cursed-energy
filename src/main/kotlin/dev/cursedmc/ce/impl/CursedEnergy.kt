package dev.cursedmc.ce.impl

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CursedEnergy : ModInitializer {
	override fun onInitialize(mod: ModContainer) {
		LOGGER.info("Initialized {}", mod.metadata().name())
	}
	
	companion object {
		// This logger is used to write text to the console and the log file.
		// It is considered best practice to use your mod name as the logger's name.
		// That way, it's clear which mod wrote info, warnings, and errors.
		val LOGGER: Logger = LoggerFactory.getLogger("Cursed Energy")
	}
}
