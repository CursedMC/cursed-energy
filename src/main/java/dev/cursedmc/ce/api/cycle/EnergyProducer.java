package dev.cursedmc.ce.api.cycle;

import dev.cursedmc.ce.api.unit.EnergyUnit;

/**
 * A producer of energy.
 */
public interface EnergyProducer<U extends EnergyUnit> {
	/**
	 * How many units are produced in one tick.
	 */
	EnergyUnit.Value<U> unitsPerTick();
}
