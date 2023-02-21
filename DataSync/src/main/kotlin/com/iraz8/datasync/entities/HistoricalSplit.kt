package com.iraz8.datasync.entities

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

@Entity
class HistoricalSplit {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id: Long? = null

    @JoinColumn(name = "symbol")
    val symbol: String
    val date: Calendar?
    val numerator: BigDecimal?
    val denominator: BigDecimal?

    constructor(yahooHistoricalSplit: yahoofinance.histquotes2.HistoricalSplit) {
        this.symbol = yahooHistoricalSplit.symbol
        this.date = yahooHistoricalSplit.date
        this.numerator = yahooHistoricalSplit.numerator
        this.denominator = yahooHistoricalSplit.denominator
    }
}