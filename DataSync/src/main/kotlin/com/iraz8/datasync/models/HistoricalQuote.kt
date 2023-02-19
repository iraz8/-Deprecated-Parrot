package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

class HistoricalQuote(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val date: Calendar,
    val open: BigDecimal,
    val low: BigDecimal,
    val high: BigDecimal,
    val close: BigDecimal,
    val adjClose: BigDecimal,
    val volume: Long
)