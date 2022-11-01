package dev.cursedmc.ce.api.unit;

import dev.cursedmc.ce.api.registry.CERegistry;
import dev.cursedmc.ce.util.Translations;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

/**
 * A unit of energy that can be converted between other units of energy.
 */
public abstract class EnergyUnit {
	private final String symbolKey;
	private final String nameKey;
	
	protected EnergyUnit(Identifier id) {
		this("unit.energy." + id.method_42094() + ".symbol", "unit.energy." + id.method_42094() + ".name");
	}
	
	public EnergyUnit(String symbolKey, String nameKey) {
		this.symbolKey = symbolKey;
		this.nameKey = nameKey;
	}
	
	/**
	 * The default implementation for energy conversion. This will throw an error by default.<br>
	 * @see Value#convert(T)
	 * @throws RuntimeException when the value cannot be converted to the given unit.
	 */
	protected <T extends @NotNull EnergyUnit, F extends @NotNull EnergyUnit> Value<T> convert(@NotNull Value<F> value, T unit) throws RuntimeException {
		String valueUnitName = Translations.get(value.unit.getNameKey());
		String unitName = Translations.get(unit.getNameKey());
		throw new RuntimeException(valueUnitName + " cannot be converted to " + unitName);
	}
	
	public Identifier getId() {
		return CERegistry.ENERGY_UNIT.getId(this);
	}
	
	/**
	 * @return The translatable key for the symbol.
	 */
	public String getSymbolKey() {
		return symbolKey;
	}
	
	/**
	 * @return The translatable string key for the name.
	 */
	public String getNameKey() {
		return nameKey;
	}
	
	/**
	 * A value of energy with {@link EnergyUnit} type of {@link U}.<br>
	 * Stores a {@code long}.
	 */
	public static class Value<U extends EnergyUnit> implements Comparable<Value<U>> {
		private final U unit;
		private long value;
		
		public Value(U unit) {
			this.unit = unit;
		}
		
		public Value(U unit, long value) {
			this.unit = unit;
			this.value = value;
		}
		
		/**
		 * Converts this {@link U} to {@link T}.<br>
		 * <b>Note</b>: Override {@link EnergyUnit#convert(Value, EnergyUnit)} instead of this method.
		 * @return The converted {@link EnergyUnit}.
		 * @param <T> The given {@link EnergyUnit} to convert to.
		 * @see EnergyUnit#convert(Value, EnergyUnit)
		 */
		public final <T extends EnergyUnit> Value<T> convert(T unit) {
			return this.getUnit().convert(this, unit);
		}
		
		@Override
		public int compareTo(@NotNull EnergyUnit.Value<U> value) {
			if (this.getValue() == value.getValue()) return 0;
			return this.getValue() > value.getValue() ? 1 : -1;
		}
		
		@Override
		public boolean equals(Object obj) {
			//noinspection PatternVariableHidesField
			if (obj instanceof Value<?> value) {
				return this.getValue() == value.getValue();
			}
			return false;
		}
		
		public U getUnit() {
			return unit;
		}
		
		public long getValue() {
			return value;
		}
		
		public void setValue(long value) {
			this.value = value;
		}
	}
}
