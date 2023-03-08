package pokemonBattle;

/**
 * ゲーム実行結果の勝敗に関する情報
 * 
 * @author Taichi Niina
 * @date 2023/01/27
 *
 *
 */
public class Game {
	//main50行目参照
	public int judge(Player p1, Player p2) {
		
		return p1.getPokemon().compare(p2.getPokemon());
	}

}
