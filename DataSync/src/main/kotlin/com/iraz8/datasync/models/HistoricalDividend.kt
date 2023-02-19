package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

class HistoricalDividend(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val date: Calendar,
    val adjDividend: BigDecimal
)