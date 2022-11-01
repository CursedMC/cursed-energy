package dev.cursedmc.ce.mixin;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Mixin(RegistryKey.class)
public interface RegistryKeyAccessor {
	@Invoker("of")
	static <T> RegistryKey<T> of(Identifier registry, Identifier value) {
		throw new IllegalStateException("Injection failed.");
	}
}
