package dev.cursedmc.ce.api

import dev.cursedmc.ce.api.unit.EnergyUnit

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.plus(value: Long): EnergyUnit.Value<U> {
	this.value += value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.plus(value: EnergyUnit.Value<U>): EnergyUnit.Value<U> {
	this.value += value.value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.plusAssign(value: Long) {
	this.value += value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.plusAssign(value: EnergyUnit.Value<U>) {
	this.value += value.value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.minus(value: Long): EnergyUnit.Value<U> {
	this.value -= value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.minus(value: EnergyUnit.Value<U>): EnergyUnit.Value<U> {
	this.value -= value.value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.minusAssign(value: Long) {
	this.value -= value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.minusAssign(value: EnergyUnit.Value<U>) {
	this.value -= value.value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.times(value: Long): EnergyUnit.Value<U> {
	this.value *= value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.times(value: EnergyUnit.Value<U>): EnergyUnit.Value<U> {
	this.value *= value.value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.timesAssign(value: Long) {
	this.value *= value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.timesAssign(value: EnergyUnit.Value<U>) {
	this.value *= value.value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.div(value: Long): EnergyUnit.Value<U> {
	this.value /= value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.div(value: EnergyUnit.Value<U>): EnergyUnit.Value<U> {
	this.value /= value.value
	return this
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.divAssign(value: Long) {
	this.value /= value
}

operator fun <U : EnergyUnit<U>> EnergyUnit.Value<U>.divAssign(value: EnergyUnit.Value<U>) {
	this.value /= value.value
}
