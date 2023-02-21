package com.iraz8.datasync.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.math.BigDecimal
import java.util.*

@Entity
class StockStats {
    @Id
    @JoinColumn(name = "symbol")
    val symbol: String
    val marketCap: BigDecimal?
    val sharesFloat: Long?
    val sharesOutstanding: Long?
    val sharesOwned: Long?
    val eps: BigDecimal?
    val pe: BigDecimal?
    val peg: BigDecimal?
    val epsEstimateCurrentYear: BigDecimal?
    val epsEstimateNextQuarter: BigDecimal?
    val epsEstimateNextYear: BigDecimal?
    val priceBook: BigDecimal?
    val priceSales: BigDecimal?
    val bookValuePerShare: BigDecimal?
    val revenue: BigDecimal?
    val EBITDA: BigDecimal?
    val oneYearTargetPrice: BigDecimal?
    val shortRatio: BigDecimal?
    val earningsAnnouncement: Calendar?

    constructor(yahooStockStats: yahoofinance.quotes.stock.StockStats) {
        this.symbol = yahooStockStats.symbol
        this.marketCap = yahooStockStats.marketCap
        this.sharesFloat = yahooStockStats.sharesFloat
        this.sharesOutstanding = yahooStockStats.sharesOutstanding
        this.sharesOwned = yahooStockStats.sharesOwned
        this.eps = yahooStockStats.eps
        this.pe = yahooStockStats.pe
        this.peg = yahooStockStats.peg
        this.epsEstimateCurrentYear = yahooStockStats.epsEstimateCurrentYear
        this.epsEstimateNextQuarter = yahooStockStats.epsEstimateNextQuarter
        this.epsEstimateNextYear = yahooStockStats.epsEstimateNextYear
        this.priceBook = yahooStockStats.priceBook
        this.priceSales = yahooStockStats.priceSales
        this.bookValuePerShare = yahooStockStats.bookValuePerShare
        this.revenue = yahooStockStats.revenue
        this.EBITDA = yahooStockStats.ebitda
        this.oneYearTargetPrice = yahooStockStats.oneYearTargetPrice
        this.shortRatio = yahooStockStats.shortRatio
        this.earningsAnnouncement = yahooStockStats.earningsAnnouncement
    }
}