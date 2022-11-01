package dev.cursedmc.ce.test

import dev.cursedmc.ce.api.unit.EnergyUnit
import dev.cursedmc.ce.api.unit.EnergyUnits
import net.minecraft.util.Identifier

class TestEnergy(id: Identifier) : EnergyUnit(id) {
	override fun <T : EnergyUnit, F : EnergyUnit> convert(value: Value<F>, unit: T): Value<T> {
		if (unit.id.equals(EnergyUnits.CURSED_ENERGY_ID) && unit is TestEnergy) {
			return Value(unit as T, value.value)
		}
		
		return super.convert(value, unit)
	}
}
