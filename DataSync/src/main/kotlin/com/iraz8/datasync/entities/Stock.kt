package com.iraz8.datasync.entities

import jakarta.persistence.*

@Entity
class Stock {
    @Id
    val symbol: String
    val name: String?
    val currency: String?
    val stockExchange: String?

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val quote: StockQuote

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val stats: StockStats

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val dividend: StockDividend

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val history: List<HistoricalQuote>

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val dividendHistory: List<HistoricalDividend>

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "symbol")
    val splitHistory: List<HistoricalSplit>

    constructor (yahooStock: yahoofinance.Stock) {
        this.symbol = yahooStock.symbol
        this.name = yahooStock.name
        this.currency = yahooStock.currency
        this.stockExchange = yahooStock.stockExchange
        this.quote = StockQuote(yahooStock.quote)
        this.stats = StockStats(yahooStock.stats)
        this.dividend = StockDividend(yahooStock.dividend)

        val historyList = yahooStock.history.stream().map { HistoricalQuote(it) }.toList()
        this.history = historyList

        val dividendHistoryList = yahooStock.dividendHistory.stream().map { HistoricalDividend(it) }.toList()
        this.dividendHistory = dividendHistoryList

        val historicalSplitList = yahooStock.splitHistory.stream().map { HistoricalSplit(it) }.toList()
        this.splitHistory = historicalSplitList

    }
}