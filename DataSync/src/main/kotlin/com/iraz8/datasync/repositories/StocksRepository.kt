package com.iraz8.datasync.repositories

import com.iraz8.datasync.entities.Stock
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StocksRepository: JpaRepository<Stock, String>