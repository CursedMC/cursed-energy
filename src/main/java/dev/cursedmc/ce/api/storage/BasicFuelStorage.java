package dev.cursedmc.ce.api.storage;

import dev.cursedmc.ce.api.fuel.Fuel;
import dev.cursedmc.ce.api.fuel.FuelAmount;
import dev.cursedmc.ce.api.fuel.FuelType;

public class BasicFuelStorage implements FuelStorage {
	private final FuelType type;
	private final Fuel fuel;
	private final FuelAmount amount;
	
	public BasicFuelStorage(FuelType type, Fuel fuel, FuelAmount amount) {
		this.type = type;
		this.fuel = fuel;
		this.amount = amount;
	}
	
	@Override
	public FuelType getType() {
		return this.type;
	}
	
	@Override
	public Fuel getFuel() {
		return this.fuel;
	}
	
	@Override
	public FuelAmount getAmount() {
		return this.amount;
	}
}
