package com.iraz8.datasync.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import java.math.BigDecimal
import java.util.*

@Entity
class StockQuote {
    @Id
    @JoinColumn(name = "symbol")
    val symbol: String
    val timeZone: TimeZone?
    val ask: BigDecimal?
    val askSize: Long?
    val bid: BigDecimal?
    val bidSize: Long?
    val price: BigDecimal?
    val lastTradeSize: Long?
    val lastTradeDateStr: String?
    val lastTradeTimeStr: String?
    val lastTradeTime: Calendar?
    val open: BigDecimal?
    val previousClose: BigDecimal?
    val dayLow: BigDecimal?
    val dayHigh: BigDecimal?
    val yearLow: BigDecimal?
    val yearHigh: BigDecimal?
    val priceAvg50: BigDecimal?
    val priceAvg200: BigDecimal?
    val volume: Long?
    val avgVolume: Long?

    constructor(yahooStockQuote: yahoofinance.quotes.stock.StockQuote) {
        this.symbol = yahooStockQuote.symbol
        this.timeZone = yahooStockQuote.timeZone
        this.ask = yahooStockQuote.ask
        this.askSize = yahooStockQuote.askSize
        this.bid = yahooStockQuote.bid
        this.bidSize = yahooStockQuote.bidSize
        this.price = yahooStockQuote.price
        this.lastTradeSize = yahooStockQuote.lastTradeSize
        this.lastTradeDateStr = yahooStockQuote.lastTradeDateStr
        this.lastTradeTimeStr = yahooStockQuote.lastTradeTimeStr
        this.lastTradeTime = yahooStockQuote.lastTradeTime
        this.open = yahooStockQuote.open
        this.previousClose = yahooStockQuote.previousClose
        this.dayLow = yahooStockQuote.dayLow
        this.dayHigh = yahooStockQuote.dayHigh
        this.yearLow = yahooStockQuote.yearLow
        this.yearHigh = yahooStockQuote.yearHigh
        this.priceAvg50 = yahooStockQuote.priceAvg50
        this.priceAvg200 = yahooStockQuote.priceAvg200
        this.volume = yahooStockQuote.volume
        this.avgVolume = yahooStockQuote.avgVolume
    }
}