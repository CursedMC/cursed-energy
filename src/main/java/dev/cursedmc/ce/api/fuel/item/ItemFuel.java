package dev.cursedmc.ce.api.fuel.item;

import dev.cursedmc.ce.api.fuel.Fuel;
import dev.cursedmc.ce.api.fuel.FuelType;
import net.minecraft.item.Item;

public class ItemFuel implements Fuel<Item> {
	@Override
	public FuelType getType() {
		return FuelType.ITEM;
	}
	
	@Override
	public Item getItem() {
		return null;
	}
}
