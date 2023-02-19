package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

class StockDividend(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val payDate: Calendar,
    val exDate: Calendar,
    val annualYield: BigDecimal,
    val annualYieldPercent: BigDecimal
)