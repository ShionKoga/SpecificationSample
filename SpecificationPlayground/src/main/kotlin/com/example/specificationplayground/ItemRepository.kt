package com.example.specificationplayground

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ItemRepository: JpaRepository<ItemRecord, Int>, JpaSpecificationExecutor<ItemRecord> {
}
