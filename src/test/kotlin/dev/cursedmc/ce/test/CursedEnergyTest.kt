package dev.cursedmc.ce.test

import dev.cursedmc.ce.api.registry.CERegistry
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry
import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qkl.wrapper.qsl.registry.register
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class CursedEnergyTest private constructor() : ModInitializer {
	override fun onInitialize(mod: ModContainer) {
		LOGGER.info("Initialized {}", mod.metadata().name())
	}
	
	companion object {
		val LOGGER: Logger = LoggerFactory.getLogger("Cursed Energy Test")
		private val TEST_ENERGY_ID = Identifier("cursed-energy-test", "test_energy")
		val TEST_ENERGY: TestEnergy = Registry.register(CERegistry.ENERGY_UNIT, TEST_ENERGY_ID, TestEnergy(TEST_ENERGY_ID))
	}
}
