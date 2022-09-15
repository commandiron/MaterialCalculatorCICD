package com.commandiron.materialcalculatorcicd.domain

enum class Operation(val symbol: Char) {
    ADD(symbol = '+'),
    SUBTRACT(symbol = '-'),
    MULTIPLY(symbol = 'x'),
    DIVIDE(symbol = '/'),
    PERCENT(symbol = '%')
}

val operationSymbols = Operation.values().map { it.symbol }.joinToString("")

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid symbol")
}