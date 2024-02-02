package com.phase1Assignment.loancalculator.models


data class MonthlyPayment(
    val month: Int,
    val mainDebtAmount: Float,
    val interestAmount: Float,
    val totalAmount: Float,
    val remainder: Float
)