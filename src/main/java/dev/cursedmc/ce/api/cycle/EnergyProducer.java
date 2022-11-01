package dev.cursedmc.ce.api.cycle;

/**
 * A producer of energy.
 */
public interface EnergyProducer {
	/**
	 * How many units are produced in one tick.
	 */
	long unitsPerTick();
}
