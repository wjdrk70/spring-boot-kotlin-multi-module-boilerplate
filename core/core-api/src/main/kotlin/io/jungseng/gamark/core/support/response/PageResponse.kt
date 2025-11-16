package io.jungseng.gamark.core.support.response

data class PageResponse<T>(
    val content: List<T>,
    val hasNext: Boolean,
)
