package dev.cursedmc.ce.api.storage;

import dev.cursedmc.ce.api.fuel.Fuel;

public class BasicFuelStorage<F> implements FuelStorage<F> {
	private Fuel<F> fuel;
	private long amount;
	
	public BasicFuelStorage(Fuel<F> fuel, long amount) {
		this.fuel = fuel;
		this.amount = amount;
	}
	
	public BasicFuelStorage(Fuel<F> fuel) {
		this(fuel, 0);
	}
	
	@Override
	public Fuel<F> getFuel() {
		return this.fuel;
	}
	
	@Override
	public void setFuel(Fuel<F> fuel) {
		this.fuel = fuel;
	}
	
	@Override
	public long getAmount() {
		return this.amount;
	}
	
	@Override
	public void setAmount(long amount) {
		this.amount = amount;
	}
}
