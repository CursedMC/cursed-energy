package dev.cursedmc.ce.api.cycle;

import dev.cursedmc.ce.api.storage.FuelStorage;

/**
 * A consumer of fuel.
 */
public interface FuelConsumer {
	/**
	 * For furnaces, gets the ratio of current fuelTime to normal furnace (default) fuelTime.<br>
	 * For other consumers of fuel, gets the ratio of units/tick (current fuelTime) to default units/tick (normal fuelTime).<br>
	 * For non-furnace consumers of fuel, this ratio is always {@code 1.0L}.
	 */
	default long getFuelPower() {
		return getFuelTime() / getDefaultFuelTime();
	}
	
	/**
	 * The amount of time it takes to burn off the current fuel.
	 * @return The fuelTime of the currently inserted fuel.
	 */
	long getFuelTime();
	
	/**
	 * @return The normal furnace (default) fuelTime of the currently inserted fuel.
	 */
	default long getDefaultFuelTime() {
		return getFuelTime();
	}
	
	/**
	 * @return The currently inserted fuel.
	 */
	FuelStorage getFuelStorage();
}
