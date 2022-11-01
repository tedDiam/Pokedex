package com.sergediame.remote.responses

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PokemonResponse(
    val abilities: List<Ability>,
    val base_experience: Int,
    val forms: List<Form>,
    val game_indices: List<GameIndice>,
    val height: Int,
    val held_items: List<HeldItem>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Int,
    val past_types: List<@Contextual Any>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)

@Serializable
data class Ability(
    val ability: AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)

@Serializable
data class Form(
    val name: String,
    val url: String
)

@Serializable
data class GameIndice(
    val game_index: Int,
    val version: Version
)

@Serializable
data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)

@Serializable
data class Move(
    val move: MoveX,
    val version_group_details: List<VersionGroupDetail>
)

@Serializable
data class Species(
    val name: String,
    val url: String
)

@Serializable
data class Sprites(
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any,
    val other: Other,
    val versions: Versions
)

@Serializable
data class Stat(
    val base_stat: Int,
    val effort: Int,
    val stat: StatX
)

@Serializable
data class Type(
    val slot: Int,
    val type: TypeX
)

@Serializable
data class AbilityX(
    val name: String,
    val url: String
)

@Serializable
data class Version(
    val name: String,
    val url: String
)

@Serializable
data class Item(
    val name: String,
    val url: String
)

@Serializable
data class VersionDetail(
    val rarity: Int,
    val version: Version
)

@Serializable
data class MoveX(
    val name: String,
    val url: String
)

@Serializable
data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: MoveLearnMethod,
    val version_group: VersionGroup
)

@Serializable
data class MoveLearnMethod(
    val name: String,
    val url: String
)

@Serializable
data class VersionGroup(
    val name: String,
    val url: String
)

@Serializable
data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    @SerialName("official-artwork")val officialArtwork: OfficialArtwork
)

@Serializable
data class Versions(
    @SerialName("generation-i")val generationI: GenerationI,
    @SerialName("generation-ii")val generationII: GenerationIi,
    @SerialName("generation-iii")val generationIII: GenerationIii,
    @SerialName("generation-iv")val generationIv: GenerationIv,
    @SerialName("generation-v")val generationV: GenerationV,
    @SerialName("generation-vi")val generationVi: GenerationVi,
    @SerialName("generation-vii")val generationVii: GenerationVii,
    @SerialName("generation-viii")val generationViii: GenerationViii
)

@Serializable
data class DreamWorld(
    val front_default: String,
    @Contextual val front_female: Any
)

@Serializable
data class Home(
    val front_default: String,
    @Contextual val front_female: Any,
    @Contextual val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class OfficialArtwork(
    val front_default: String
)

@Serializable
data class GenerationI(
    @SerialName("red-blue")val redBlue: RedBlue,
    val yellow: Yellow
)

@Serializable
data class GenerationIi(
    val crystal: Crystal,
    val gold: Gold,
    val silver: Silver
)

@Serializable
data class GenerationIii(
    val emerald: Emerald,
    @SerialName("firered-leafgreen")val fireredLeafgreen: FireredLeafgreen,
    @SerialName("ruby-sapphire")val rubySapphire: RubySapphire
)

@Serializable
data class GenerationIv(
    @SerialName("diamond-pearl")val diamondPearl: DiamondPearl,
    @SerialName("heartgold-soulsilver")val heartgoldSoulsilver: HeartgoldSoulsilver,
    val platinum: Platinum
)

@Serializable
data class GenerationV(
    @SerialName("black-white")val blackWhite: BlackWhite
)

@Serializable
data class GenerationVi(
    @SerialName("omegaruby-alphasapphire")val omegarubyAlphasapphire: OmegarubyAlphasapphire,
    @SerialName("x-y")val xy: XY
)

@Serializable
data class GenerationVii(
    val icons: Icons,
    @SerialName("ultra-sun-ultra-moon")val ultraSunUltraMoon: UltraSunUltraMoon
)

@Serializable
data class GenerationViii(
    val icons: Icons
)

@Serializable
data class RedBlue(
    val back_default: String,
    val back_gray: String,
    val back_transparent: String,
    val front_default: String,
    val front_gray: String,
    val front_transparent: String
)

@Serializable
data class Yellow(
    val back_default: String,
    val back_gray: String,
    val back_transparent: String,
    val front_default: String,
    val front_gray: String,
    val front_transparent: String
)

@Serializable
data class Crystal(
    val back_default: String,
    val back_shiny: String,
    val back_shiny_transparent: String,
    val back_transparent: String,
    val front_default: String,
    val front_shiny: String,
    val front_shiny_transparent: String,
    val front_transparent: String
)

@Serializable
data class Gold(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String,
    val front_transparent: String
)

@Serializable
data class Silver(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String,
    val front_transparent: String
)

@Serializable
data class Emerald(
    val front_default: String,
    val front_shiny: String
)

@Serializable
data class FireredLeafgreen(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String
)

@Serializable
data class RubySapphire(
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String
)

@Serializable
data class DiamondPearl(
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class HeartgoldSoulsilver(
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class Platinum(
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class BlackWhite(
    val animated: Animated,
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class Animated(
    val back_default: String,
    @Contextual val back_female: Any,
    val back_shiny: String,
    @Contextual val back_shiny_female: Any,
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class OmegarubyAlphasapphire(
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class XY(
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class Icons(
    val front_default: String,
    @Contextual val front_female: Any
)

@Serializable
data class UltraSunUltraMoon(
    val front_default: String,
    @Contextual val front_female: Any,
    val front_shiny: String,
    @Contextual val front_shiny_female: Any
)

@Serializable
data class StatX(
    val name: String,
    val url: String
)

@Serializable
data class TypeX(
    val name: String,
    val url: String
)