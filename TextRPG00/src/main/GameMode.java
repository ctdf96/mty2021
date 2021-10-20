package main;

import java.util.Scanner;

import characters.Fighter;
import characters.Healer;
import characters.Hero;
import characters.Human;
import characters.Knight;
import characters.Mage;
import characters.Party;
import library.Constant;

/**
 * ゲームモード：mainメソッド内の主処理以外で必要なメソッドをここに作成
 * author ilearning
 *
 */
public class GameMode {

	// メンバー新規登録処理
	/**
	 * Partyに人間３人をセットして返す
	 * @return
	 */
	public Party createMembers() {

		Scanner scan = new Scanner(System.in);
		Party party = new Party();

		// パーティのメンバー１人を新しく作成してpartyにセット
			// ※あえて入力値のチェックはしない
			// 1.職業の一覧表示
			for (String str : Constant.jobList) {
				System.out.println(str);
			}
			System.out.println();
			System.out.println("パーティメンバーを選んでください　 １人目");
			Human member = null;
			// 職業番号入力
			// ※1-5以外はKnightが入る
			String inpJobNo = scan.nextLine();

			// numericチェック　なし
			// 範囲チェック　なし

			// 入力値に対応したインスタンスを生成
			switch(inpJobNo) {
			case "1":			// Fighter
				member = new Fighter();
				break;
			case "2":			// Mage
				member = new Mage();
				break;
			case "3":			// Hero
				member = new Hero();
				break;
			case "4":			// Knight
				member = new Knight();
				break;
			case "5":			// Healer
				member = new Healer();
				break;
			default:			// 1-5以外はKnightをセット
				member = new Knight();
				break;
			};
			// 名前入力
			System.out.println("名前を入力してください");
			String inpName = scan.nextLine();
			member.setName(inpName);

			// インスタンスをPartyにセット
			party.setHuman(member);

System.out.println();
			// パーティのメンバー１人を新しく作成してpartyにセット
						// ※あえて入力値のチェックはしない
						// 1.職業の一覧表示
						for (String str : Constant.jobList) {
							System.out.println(str);
						}
						System.out.println();
						System.out.println("パーティメンバーを選んでください　 2人目");
						Human member2 = null;
						// 職業番号入力
						// ※1-5以外はKnightが入る
						String inpJobNo2 = scan.nextLine();

						// numericチェック　なし
						// 範囲チェック　なし

						// 入力値に対応したインスタンスを生成
						switch(inpJobNo2) {
						case "1":			// Fighter
							member2 = new Fighter();
							break;
						case "2":			// Mage
							member2 = new Mage();
							break;
						case "3":			// Hero
							member2 = new Hero();
							break;
						case "4":			// Knight
							member2 = new Knight();
							break;
						case "5":			// Healer
							member2 = new Healer();
							break;
						default:			// 1-5以外はKnightをセット
							member2 = new Knight();
							break;
						};
						// 名前入力
						System.out.println("名前を入力してください");
						String inpName2 = scan.nextLine();
						member2.setName(inpName2);

						// インスタンスをPartyにセット
						party.setHuman(member2);



System.out.println();
						// パーティのメンバー１人を新しく作成してpartyにセット
						// ※あえて入力値のチェックはしない
						// 1.職業の一覧表示
						for (String str : Constant.jobList) {
							System.out.println(str);
							}
						System.out.println();
						System.out.println("パーティメンバーを選んでください　 3人目");
						Human member3 = null;
						// 職業番号入力
						// ※1-5以外はKnightが入る
						String inpJobNo3 = scan.nextLine();

						// numericチェック　なし
						// 範囲チェック　なし

						// 入力値に対応したインスタンスを生成
						switch(inpJobNo3) {
						case "1":			// Fighter
							member3 = new Fighter();
							break;
						case "2":			// Mage
							member3 = new Mage();
							break;
						case "3":			// Hero
							member3 = new Hero();
							break;
						case "4":			// Knight
							member3 = new Knight();
							break;
						case "5":			// Healer
							member3 = new Healer();
							break;
						default:			// 1-5以外はKnightをセット
							member3 = new Knight();
							break;
						};

						// 名前入力
						System.out.println("名前を入力してください");
						String inpName3 = scan.nextLine();
						member3.setName(inpName3);

						// インスタンスをPartyにセット
						party.setHuman(member3);

		// パーティ名入力　　チェックなし
		System.out.println("パーティ名を入力してください");
		String partyName = scan.nextLine();
		party.setName(partyName);

		return party;

	}
}
