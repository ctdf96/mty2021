package jp.kenschool.chapter7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferdWriterSample {

	public static void main(String[] args) {
		FileWriter fw = null;//ファイルに書き込む準備
		BufferedWriter bw = null;

		FileReader fr = null;//読み込む準備をする
		BufferedReader br = null;

		File file = new File("ken2.txt");//どのファイルを開くかを指定
		try {
			fw = new FileWriter(file);//使うファイル情報を渡し、コンストラクタでインスタンス生成
			bw = new BufferedWriter(fw);//FileWriterで指定したファイル情報を与える

			bw.write("おはようございます");
			bw.newLine();
			bw.write("こんにちは");
			bw.newLine();
			bw.write("こんばんは");
			bw.flush();
			System.out.println("ken2.txtに書き出し完了");

			fr = new FileReader(file);
			br = new BufferedReader(fr);

//			1行読み込んだものを変数strに入れて、文字が入っていれば出力、何もなければnullなのでループしない
			String str = null;
			while((str = br.readLine() ) != null){//１行ずつ読みこむ　何もなくなれば nullになるまで
				System.out.println();
				System.out.println(str);
			}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();

		} finally {
			try {//Bufferedを含めたストリームをすべて閉じる
				if(fw != null ) {
					fw.close();
				}
				if(bw != null ) {
					bw.close();
				}
				if(fr != null ) {
					fr.close();
				}
				if(br != null ) {
					br.close();
				}

			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}

		}
	}

}
