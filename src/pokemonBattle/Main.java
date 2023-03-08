package pokemonBattle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.print("-- Welcome to PokemonBattle --\n" + "\n" + "博士：きみの名前はなんというじゃ？>>>");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName = reader.readLine();

		//ユーザープレイヤーのインスタンス生成
		Player user = new Player(userName);
		//エナミープレイヤーのインスタンス生成
		Player enemy = new Player("敵のポケモン");
		//ゲーム詳細のインスタンスを生成
		Game game = new Game();

		System.out.println("ポケモンの旅に出かけますか？ \n\nYesの場合は数字の1 Noの場合は数字の2を入力してね >>>");

		String ansewer = reader.readLine();
		int num = Integer.parseInt(ansewer);

		if (num == 1) {
			System.out.println("それでは、旅に出かけよう＝＝＞");

			// ユーザーの手持ちポケモンをランダムで取得
			user.createRondomPokemon();

			System.out.println("\n" + user.getPlayerName() + "さん、" + "ポケモンバトルの世界へようこそ＼(-o-)／" + "\n" + user.getPlayerName() + "さんは" + "『" + user.getPokemon().getPokemonName() + "』" + "をゲットしました" + "\n");

			// 勝利回数初期値
			int count = 1;
			// 経験値の初期化
			int exp = 10;
			// 勝利回数を表示するための数字を初期化
			int win = 0;

			while (true) {
				// ランダムで敵ポケモン取得
				enemy.createRondomPokemon();
				System.out.println("\n\n >>>> BATTLE <<<< \n");
				System.out.println(enemy.getPlayerName() + "の" + "『" + enemy.getPokemon().getPokemonName() + "』" + "が出現しました");

				// 勝敗をresult変数に格納
				int result = game.judge(user, enemy);

				if (result < 0) {
					System.out.println("\n\n\n\n -------- LOSE -------- \n");
					Thread.sleep(1000);
					System.out.println(user.getPlayerName() + "さんの" + user.getPokemon().getPokemonName() + "の負けです...");
					break;
				} else if (result > 0) {

					exp += 10;
					win += 1;
					if (count < 3) {
						count++;
						
						System.out.println("\n\n\n\n -------- WIN x " + win + "-------- \n\n >>>経験値：" + exp + "\tGET");
						Thread.sleep(1000);
						System.out.println(user.getPlayerName() + "さんの" + user.getPokemon().getPokemonName() + "の勝ちです！！" + "\n");
						
					} else {
						System.out.println("\n\n\n\n -------- WIN x " + win + "-------- \n >>>経験値：" + (exp + 10)+ "\tGET \tLEVEL MAX★★★ \n");// 3勝利するとLEVEL MAX★★★コンソールに表示
						Thread.sleep(1000);
						System.out.println("\n\n\n" + user.getPlayerName() + "さん、おめでとうございます！ゲームクリアです！" + "\nゲームを終了します。");
						break;
					}

				} else {
					System.out.println("\n\n\n\n" + "-------- DRAW --------" + "\n");
					Thread.sleep(1000);
					System.out.println("\t" + "- 引き分けです -" + "\t");
					break;
				}
			}
		} else {
			System.out.println("ゲームを終了します。");
		}
	}
}