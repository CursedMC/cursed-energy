package dev.cursedmc.ce.api.fuel.item;

import dev.cursedmc.ce.api.fuel.Fuel;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;

public class ItemFuel implements Fuel {
	@Override
	public Item getItem() throws NullPointerException {
		return null;
	}
	
	@Override
	public Fluid getFluid() throws NullPointerException {
		throw new NullPointerException("")
	}
}
