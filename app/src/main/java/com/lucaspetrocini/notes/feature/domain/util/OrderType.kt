package com.lucaspetrocini.notes.feature.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
