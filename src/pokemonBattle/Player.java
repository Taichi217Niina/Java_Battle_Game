package pokemonBattle;

import java.util.Random;

/**
 * プレイヤーに関する情報
 * 
 * @author Taichi Niina
 * @date 2023/01/27
 * 
 *
 */
public class Player {
	
	private String playerName;
	
	private Pokemon pokemon;
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	
	public Player(String playerName) {
		this.playerName = playerName;
		
	}
	
	public void createRondomPokemon() {
		
		Random random = new Random();
		int randomValue = random.nextInt(3);
		
		if(randomValue == 0) {
			this.pokemon = new FirePokemon();
		} else if (randomValue == 1) {
			this.pokemon = new LeafPokemon();
		} else {
			this.pokemon = new WaterPokemon();
		}
		
	}
	
	

}
