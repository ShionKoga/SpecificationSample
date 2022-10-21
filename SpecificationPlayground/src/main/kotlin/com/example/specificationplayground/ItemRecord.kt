package com.example.specificationplayground

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "item")
data class ItemRecord(
    @Id
    val id: Int,
    val color: String,
    val grade: String,
    val name: String,
)
