package dev.cursedmc.ce.api.unit;

import dev.cursedmc.ce.api.registry.CERegistry;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.cursedmc.ce.impl.CursedEnergyConstants.id;

public final class EnergyUnits {
	public static final Identifier CURSED_ENERGY_ID = id("cursed_energy");
	public static final CursedEnergy CURSED_ENERGY = Registry.register(CERegistry.ENERGY_UNIT, CURSED_ENERGY_ID, new CursedEnergy(CURSED_ENERGY_ID));
	
	private EnergyUnits() {}
}
