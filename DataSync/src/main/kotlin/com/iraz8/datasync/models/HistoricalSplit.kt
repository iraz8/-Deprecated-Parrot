package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

class HistoricalSplit(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val date: Calendar,
    val numerator: BigDecimal,
    val denominator: BigDecimal
)