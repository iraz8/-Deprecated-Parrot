package com.iraz8.datasync.services

import org.springframework.stereotype.Service
import yahoofinance.Stock
import yahoofinance.YahooFinance
import java.math.BigDecimal

@Service
class StocksService(
    private val stocksListGetterService: StocksListGetterService,
    private val tickerSymbolsList: List<String> = stocksListGetterService.getTickerSymbolsList()
) {
    fun getCurrentPriceAllStocks(): HashMap<String, BigDecimal> {
        val map = HashMap<String, BigDecimal>()
        this.tickerSymbolsList.forEach { map[it] = YahooFinance.get(it).quote.price }
        return map
    }

    fun getHistoricalPricesAllStocks(): Map<String, Stock> {
        return YahooFinance.get(tickerSymbolsList.toTypedArray(), true)
    }
}


