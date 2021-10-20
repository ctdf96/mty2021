package main;

import java.util.Random;
import java.util.Scanner;

import characters.Party;
import library.Constant;

/**
 * SmpTextRPG01クラス：mainメソッドを持つ主となるクラス
 * 全体のフローをここで処理する
 * @author ilearning
 *
 */
public class SmpTextRPG01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int inpNum0 = 0;
		Party party = null;						// パーティーの変数のみ作成

		// ----- 前処理 ----- //
		System.out.println("テキストRPGゲームを開始します");

		while(true) {
			while (true) {
				try {
					System.out.println("モードを選択してください　1：新規　2：継続　0：終了");
					inpNum0 = Integer.parseInt(scan.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("正しい入力値ではありません。");
					continue;
				}
				if (inpNum0 == 1 || inpNum0 == 2 || inpNum0 == 0) {
					break;
				}
			}

			// 入力値が１，２，０だった
			// １．２はパーティインスタンスを作成
			// ０は終了処理へ
			GameMode gamemode = new GameMode();
			switch(inpNum0) {
			case 1:								// 新規登録
				party = gamemode.createMembers();
				break;
			case 2:								// 継続

				break;
			case 0:								// 終了
				lastMessage();
				return;
			}
			// パーティ情報　表示
			System.out.println("パーティ名：" + party.getName());
			System.out.print("メンバー");
			String str = party.getAllMemberInfo();
			System.out.println(str);
			// 確認
			System.out.println("このパーティで開始しますか？　y/n");
			String inpStr = scan.nextLine();
			if (inpStr.contentEquals("y")) {
				break;
			} else {
				System.out.println("やりなおします");
			}
		}


		// ----- 本処理 ----- //
		while (true) {

			System.out.println("キーを入力してください　anyKey：歩く　e：終了");
			String inpWork = scan.nextLine();
			if (inpWork.contentEquals(Constant.INPUT_END)) {
				break;
			}
			// 歩く　モンスター出現判定
			Random ran = new Random();
			if (ran.nextInt(10) >= 4) {
				continue;
			}

			// モンスター出現
			System.out.println("モンスターが現れた");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Battle battle = new Battle();
			party = battle.battle(party);

			// 判定
			if (party.getResult() == Constant.BATTLE_WIN) {
				System.out.println("\n" + party.getName() + "はモンスターたちを倒した！");
				String message = party.getAllMemberInfo();
				System.out.println(message);
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
			} else if (party.getResult() == Constant.BATTLE_LOSE) {
				System.out.println("\n残念ですが" + party.getName() + "は全滅しました");
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO 自動生成された catch ブロック
					e.printStackTrace();
				}
// 				String inpEnd = scan.nextLine();
				lastMessage();
				return;

			}

		}

		// 終了処理
		lastMessage();

	}

	// 終了メッセージ表示、終了
	private static void lastMessage() {
		System.out.println("終了します。お疲れ様でした。");
		return;
	}

	public static void wait(int time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
