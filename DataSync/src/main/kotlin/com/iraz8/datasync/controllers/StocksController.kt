package com.iraz8.datasync.controllers

import com.iraz8.datasync.services.StocksListGetterService
import com.iraz8.datasync.services.StocksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.math.BigDecimal

@RestController
@RequestMapping("/api/")
class StocksController @Autowired constructor(
    private val stocksListGetterService: StocksListGetterService,
    private val stocksService: StocksService
) {
    @GetMapping("stock/{name}")
    fun getCurrentStockPrice(@PathVariable name: String): String {
        return name + "Hello World!"
    }

    @GetMapping("stocks")
    fun getStocksList(): List<String> {
        return this.stocksListGetterService.getTickerSymbolsList()
    }

    @GetMapping("stocks/prices")
    fun getStocksCurrentPricesList(): HashMap<String, BigDecimal> {
        return this.stocksService.getCurrentPriceAllStocks()
    }
}