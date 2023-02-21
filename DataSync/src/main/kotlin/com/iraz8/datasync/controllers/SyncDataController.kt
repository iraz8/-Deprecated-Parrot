package com.iraz8.datasync.controllers

import com.iraz8.datasync.services.SyncDataService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/")
class SyncDataController @Autowired constructor(private val syncDataService: SyncDataService) {
    @GetMapping("sync")
    fun syncAllData(): Boolean {
        this.syncDataService.syncAllData()
        return true
    }
}