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

		// パーティのメンバー３人を新しく作成してpartyにセット
		for(int i = 0; i < 3; i++) {
			// ※あえて入力値のチェックはしない
			// 1.職業の一覧表示
			for (String str : Constant.jobList) {
				System.out.println(str);
			}
			System.out.println("パーティメンバーを選んでください　" + (i + 1) + "人目");
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
			party.addMember(member);
		}
		// パーティ名入力
		System.out.println("パーティ名を入力してください");
		String partyName = scan.nextLine();
		party.setName(partyName);

		return party;
	}







}
