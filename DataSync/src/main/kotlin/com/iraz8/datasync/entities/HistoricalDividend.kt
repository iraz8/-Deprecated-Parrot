package com.iraz8.datasync.entities

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import java.math.BigDecimal
import java.util.*

@Entity
class HistoricalDividend {

    @Id
    @OneToOne(mappedBy = "symbol")
    val symbol: String
    val date: Calendar?
    val adjDividend: BigDecimal?

    constructor(yahooHistoricalDividend: yahoofinance.histquotes2.HistoricalDividend) {
        this.symbol = yahooHistoricalDividend.symbol
        this.date = yahooHistoricalDividend.date
        this.adjDividend = yahooHistoricalDividend.adjDividend
    }
}