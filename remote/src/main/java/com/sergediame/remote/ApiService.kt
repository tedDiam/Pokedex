package com.sergediame.remote

import com.sergediame.remote.responses.AllPokemonResponse
import com.sergediame.remote.responses.PokemonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("pokemon")
    suspend fun getAllPokemon(
        @Query("offset") offset: Int?,
        @Query("limit") limit: Int?
    ): AllPokemonResponse

    @GET("pokemon/{name}")
    suspend fun getPokemon(
        @Path("name") name: String
    ): PokemonResponse
}