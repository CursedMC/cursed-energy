package dev.cursedmc.ce.api.cycle;

/**
 * A consumer of energy.
 */
public interface EnergyConsumer {
	/**
	 * How many units are consumed in one tick.
	 */
	long unitsPerTick();
}
