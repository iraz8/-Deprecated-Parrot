package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

@Entity
class StockStats(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val marketCap: BigDecimal,
    val sharesFloat: Long,
    val sharesOutstanding: Long,
    val sharesOwned: Long,
    val eps: BigDecimal,
    val pe: BigDecimal,
    val peg: BigDecimal,
    val epsEstimateCurrentYear: BigDecimal,
    val epsEstimateNextQuarter: BigDecimal,
    val epsEstimateNextYear: BigDecimal,
    val priceBook: BigDecimal,
    val priceSales: BigDecimal,
    val bookValuePerShare: BigDecimal,
    val revenue: BigDecimal,
    val EBITDA: BigDecimal,
    val oneYearTargetPrice: BigDecimal,
    val shortRatio: BigDecimal,
    val earningsAnnouncement: Calendar
)