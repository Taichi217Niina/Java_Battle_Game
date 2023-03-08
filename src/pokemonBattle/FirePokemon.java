package pokemonBattle;

/**
 * 火ポケモンに関する情報
 * 
 * @author Niina Taichi
 * @date 2023/01/27
 *
 */
public class FirePokemon implements Pokemon {

	private String pokemonName = "ヒトカゲ";

	@Override
	public int compare(Pokemon pokemon) {
		//instanceof演算子は、あるオブジェクトの型を動的に判定するための演算子 LeafPokemonのクラスかどうか
		if (pokemon instanceof LeafPokemon) {
			return 1;
		} else if (pokemon instanceof WaterPokemon) {
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
