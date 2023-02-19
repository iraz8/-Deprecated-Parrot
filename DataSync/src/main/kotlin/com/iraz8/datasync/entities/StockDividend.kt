package com.iraz8.datasync.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.math.BigDecimal
import java.util.*

@Entity
class StockDividend {
    @Id
    val symbol: String
    val payDate: Calendar?
    val exDate: Calendar?
    val annualYield: BigDecimal?
    val annualYieldPercent: BigDecimal?

    constructor(yahooStockDividend: yahoofinance.quotes.stock.StockDividend) {
        this.symbol = yahooStockDividend.symbol
        this.payDate = yahooStockDividend.payDate
        this.exDate = yahooStockDividend.exDate
        this.annualYield = yahooStockDividend.annualYield
        this.annualYieldPercent = yahooStockDividend.annualYieldPercent
    }
}