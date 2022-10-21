package com.example.specificationplayground

import jakarta.persistence.criteria.Root
import org.springframework.data.jpa.domain.Specification

class ItemSpecifications {
    companion object {
        fun colorEquals(searchColor: String?): Specification<ItemRecord>? {
            return if (searchColor == null) {
                return null
            } else {
                return Specification { root: Root<ItemRecord>, _, criteriaBuilder ->
                    criteriaBuilder.equal(root.get<String>("color"), searchColor)
                }
            }
        }
    }
}
