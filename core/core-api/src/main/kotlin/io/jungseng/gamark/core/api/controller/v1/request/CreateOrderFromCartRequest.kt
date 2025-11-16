package io.jungseng.gamark.core.api.controller.v1.request

data class CreateOrderFromCartRequest(
    val cartItemIds: Set<Long>,
)
