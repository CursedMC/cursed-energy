package dev.cursedmc.ce.api.registry;

import com.mojang.serialization.Lifecycle;
import dev.cursedmc.ce.api.unit.EnergyUnit;
import dev.cursedmc.ce.mixin.RegistryKeyAccessor;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.MutableRegistry;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.registry.SimpleRegistry;

import static dev.cursedmc.ce.impl.CursedEnergyConstants.id;

public final class CERegistry {
	private static final Identifier ROOT_KEY = id("root");
	private static final MutableRegistry<MutableRegistry<?>> ROOT = new SimpleRegistry<>(createRegistryKey("root"), Lifecycle.experimental(), null);
	
	public static final RegistryKey<Registry<EnergyUnit>> ENERGY_UNIT_KEY = createRegistryKey("energy_unit");
	public static final Registry<EnergyUnit> ENERGY_UNIT = registerSimple(ENERGY_UNIT_KEY);
	
	private CERegistry() {}
	
	private static <T> RegistryKey<Registry<T>> createRegistryKey(String registryId) {
		return RegistryKeyAccessor.of(ROOT_KEY, id(registryId));
	}
	
	private static <T> Registry<T> registerSimple(RegistryKey<? extends Registry<T>> key) {
		return registerSimple(key, Lifecycle.experimental());
	}
	
	private static <T> Registry<T> registerSimple(RegistryKey<? extends Registry<T>> key, Lifecycle lifecycle) {
		return create(key, new SimpleRegistry<>(key, lifecycle, null), lifecycle);
	}
	
	private static <T, R extends MutableRegistry<T>> R create(RegistryKey<? extends Registry<T>> key, R registry, Lifecycle lifecycle) {
		//noinspection unchecked
		ROOT.register((RegistryKey<MutableRegistry<?>>) key, registry, lifecycle);
		return registry;
	}
}
