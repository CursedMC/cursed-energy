package dev.cursedmc.ce.api.storage;

import dev.cursedmc.ce.api.fuel.Fuel;

/**
 * The storage for fuel.
 */
public interface FuelStorage<F> {
	/**
	 * @return The kind of fuel this stores.
	 */
	Fuel<F> getFuel();
	
	/**
	 * Set the kind of fuel this stores.
	 */
	void setFuel(Fuel<F> fuel);
	
	/**
	 * @return The quantity of fuel.
	 */
	long getAmount();
	
	/**
	 * Set the fuel quantity.
	 */
	void setAmount(long amount);
}
