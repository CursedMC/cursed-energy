package dev.cursedmc.ce.api.fuel;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;

/**
 * A type of fuel used by {@link dev.cursedmc.ce.api.cycle.FuelConsumer}s.
 */
public interface Fuel {
	/**
	 * @return The fuel item.
	 * @throws NullPointerException if this is not of type {@link FuelType#ITEM}.
	 */
	Item getItem() throws NullPointerException;
	
	/**
	 * @return The fuel fluid.
	 * @throws NullPointerException if this is not of type {@link FuelType#FLUID}.
	 */
	Fluid getFluid() throws NullPointerException;
	
	/**
	 * @return The custom fuel item.
	 * @param <F> The type of custom fuel item.
	 * @throws NullPointerException if this is not of type {@link FuelType#OTHER}.
	 * @throws UnsupportedOperationException if this method is unimplemented.
	 * @throws ClassCastException if {@link F} is an unsupported type.
	 */
	default <F> F getCustom() throws NullPointerException, UnsupportedOperationException, ClassCastException {
		throw new UnsupportedOperationException("custom fuel unsupported");
	}
}
