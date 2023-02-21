package com.iraz8.datasync.entities

import jakarta.persistence.*
import java.math.BigDecimal
import java.util.*

@Entity
class HistoricalQuote {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    val id: Long? = null

    @JoinColumn(name = "symbol")
    val symbol: String
    val date: Calendar?
    val open: BigDecimal?
    val low: BigDecimal?
    val high: BigDecimal?
    val close: BigDecimal?
    val adjClose: BigDecimal?
    val volume: Long?

    constructor(yahooHistoricalQuote: yahoofinance.histquotes.HistoricalQuote) {
        this.symbol = yahooHistoricalQuote.symbol
        this.date = yahooHistoricalQuote.date
        this.open = yahooHistoricalQuote.open
        this.low = yahooHistoricalQuote.low
        this.high = yahooHistoricalQuote.high
        this.close = yahooHistoricalQuote.close
        this.adjClose = yahooHistoricalQuote.adjClose
        this.volume = yahooHistoricalQuote.volume
    }
}