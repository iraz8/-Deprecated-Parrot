package com.iraz8.datasync.services

import com.iraz8.datasync.entities.Stock
import com.iraz8.datasync.repositories.StocksRepository
import org.springframework.stereotype.Service

@Service
class SyncDataService (
    private val stocksService: StocksService,
    private val stocksRepository: StocksRepository
) {
    fun syncAllData() {
        val stocks = stocksService.getHistoricalPricesAllStocksMap().values.stream().map { Stock(it) }.toList()
        stocksRepository.saveAll(stocks)
    }
}