package dev.cursedmc.ce.api.fuel;

public interface FuelAmount {
	/**
	 * @return The fuel quantity, in millibuckets.
	 * @throws NullPointerException if this is not of type {@link FuelType#FLUID}.
	 */
	long getMillibuckets() throws NullPointerException;
	
	/**
	 * @return The fuel quantity, in stack size.
	 * @throws NullPointerException if this is not of type {@link FuelType#ITEM}.
	 */
	int getStackSize() throws NullPointerException;
	
	/**
	 * @return The fuel quantity, in a custom format.
	 * @param <F> The custom fuel quantity format.
	 * @throws NullPointerException if this is not of type {@link FuelType#OTHER}.
	 * @throws UnsupportedOperationException if this method is unimplemented.
	 * @throws ClassCastException if {@link F} is an unsupported type.
	 */
	default <F> F getCustom() throws NullPointerException, UnsupportedOperationException, ClassCastException {
		throw new UnsupportedOperationException("custom fuel unsupported");
	}
	
	/**
	 * Set the fuel quantity, in millibuckets.
	 * @throws NullPointerException if this is not of type {@link FuelType#FLUID}.
	 */
	void setMillibuckets(long millibuckets) throws NullPointerException;
	
	/**
	 * Set the fuel quantity, in stack size.
	 * @throws NullPointerException if this is not of type {@link FuelType#ITEM}.
	 */
	void setStackSize(int stackSize) throws NullPointerException;
	
	/**
	 * Set the fuel quantity, in a custom format.
	 * @param <F> The custom fuel quantity format.
	 * @throws NullPointerException if this is not of type {@link FuelType#OTHER}.
	 * @throws UnsupportedOperationException if this method is unimplemented.
	 * @throws ClassCastException if {@link F} is an unsupported type.
	 */
	default <F> void setCustom(F custom) throws NullPointerException, UnsupportedOperationException, ClassCastException {
		throw new UnsupportedOperationException("custom fuel unsupported");
	}
}
