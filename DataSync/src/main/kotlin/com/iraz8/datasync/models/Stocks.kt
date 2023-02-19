package com.iraz8.datasync.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
class Stocks(
    val name: String,
    val currency: String,
    val stockExchange: String,
    @Column(nullable = false)
    @Id
    val symbol: String
)
