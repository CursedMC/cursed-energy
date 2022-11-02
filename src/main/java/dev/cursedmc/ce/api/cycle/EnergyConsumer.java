package dev.cursedmc.ce.api.cycle;

import dev.cursedmc.ce.api.unit.EnergyUnit;

/**
 * A consumer of energy.
 */
public interface EnergyConsumer<U extends EnergyUnit> {
	/**
	 * How many units are consumed in one tick.
	 */
	EnergyUnit.Value<U> unitsPerTick();
}
