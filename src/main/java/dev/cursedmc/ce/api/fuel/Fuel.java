package dev.cursedmc.ce.api.fuel;

/**
 * A type of fuel used by {@link dev.cursedmc.ce.api.cycle.FuelConsumer}s.
 * @param <F> The type of custom fuel item.
 */
public interface Fuel<F> {
	/**
	 * @return The type of fuel.
	 */
	FuelType getType();
	
	/**
	 * @return The fuel item.
	 */
	F getItem();
}
