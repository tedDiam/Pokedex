package com.sergediame.remote.responses

import kotlinx.serialization.Serializable

@Serializable
data class AllPokemonResponse(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)

@Serializable
data class Result(
    val name: String,
    val url: String
)