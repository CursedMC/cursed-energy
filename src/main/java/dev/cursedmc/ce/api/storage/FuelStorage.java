package dev.cursedmc.ce.api.storage;

import dev.cursedmc.ce.api.fuel.Fuel;
import dev.cursedmc.ce.api.fuel.FuelAmount;
import dev.cursedmc.ce.api.fuel.FuelType;

/**
 * The storage for fuel.
 */
public interface FuelStorage {
	/**
	 * @return The type of fuel.
	 */
	FuelType getType();
	
	/**
	 * @return The kind of fuel this stores.
	 */
	Fuel getFuel();
	
	/**
	 * @return The quantity of fuel.
	 */
	FuelAmount getAmount();
}
