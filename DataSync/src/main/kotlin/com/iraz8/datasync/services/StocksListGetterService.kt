package com.iraz8.datasync.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.io.File


@Service
class StocksListGetterService(
    @Value("\${active_stocks_list.file_location}")
    private var fileLocation: String
) {
    private val COMMENT_CHAR = "#"
    private val EMPTY_SPACE = " "

    private final var tickerSymbolsList: List<String>

    init {
        this.tickerSymbolsList = readActiveStocksList()
    }

    private fun readActiveStocksList(): ArrayList<String> {
        val tickerSymbolsList = ArrayList<String>()
        File(fileLocation).forEachLine {
            if (!it.startsWith(COMMENT_CHAR) && !it.startsWith(EMPTY_SPACE)) {
                tickerSymbolsList.add(it)
            }
        }
        return tickerSymbolsList
    }

    fun getTickerSymbolsList(): List<String> {
        return this.tickerSymbolsList
    }

}