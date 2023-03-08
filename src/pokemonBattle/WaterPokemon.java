package pokemonBattle;

/**
 * 水ポケモンに関する情報
 * 
 * @author Niina Taichi
 * @date 2023/01/27
 *
 */
public class WaterPokemon implements Pokemon {
	
	private String pokemonName = "ゼニガメ";

	@Override
	public int compare(Pokemon pokemon) {
		
		if (pokemon instanceof FirePokemon) {
			return 1;
		} else if (pokemon instanceof LeafPokemon) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String getPokemonName() {
		return this.pokemonName;
	}
}
