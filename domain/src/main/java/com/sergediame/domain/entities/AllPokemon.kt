package com.sergediame.domain.entities

data class AllPokemon(
    val count: Int,
    val next: String,
    val previous: String,
    val results: List<Result>
)

data class Result(
    val name: String,
    val url: String
)