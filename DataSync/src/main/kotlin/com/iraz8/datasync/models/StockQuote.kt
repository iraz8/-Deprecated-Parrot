package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

@Entity
class StockQuote(
    @Column(nullable = false)
    @Id
    val symbol: String,
    val timeZone: TimeZone,
    val ask: BigDecimal,
    val askSize: Long,
    val bid: BigDecimal,
    val bidSize: Long,
    val price: BigDecimal,
    val lastTradeSize: Long,
    val lastTradeDateStr: String,
    val lastTradeTimeStr: String,
    val lastTradeTime: Calendar,
    val open: BigDecimal,
    val previousClose: BigDecimal,
    val dayLow: BigDecimal,
    val dayHigh: BigDecimal,
    val yearLow: BigDecimal,
    val yearHigh: BigDecimal,
    val priceAvg50: BigDecimal,
    val priceAvg200: BigDecimal,
    val volume: Long,
    val avgVolume: Long
)