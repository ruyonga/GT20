package com.ruyonga.gadleader.model

data class TopLearners(
    val results: List<Leaders>
)
data class Leaders(val name: String, val hours: Int, val country: String, val badgeUrl: String)