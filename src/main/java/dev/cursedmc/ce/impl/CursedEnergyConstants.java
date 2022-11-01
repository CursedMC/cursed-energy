package dev.cursedmc.ce.impl;

import net.minecraft.util.Identifier;

public final class CursedEnergyConstants {
	public static final String MOD_ID = "cursed-energy";
	
	private CursedEnergyConstants() {}
	
	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
