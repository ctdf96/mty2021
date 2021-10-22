package jp.kenschool.chapter7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderSample {

	public static void main(String[] args) {
		FileWriter fw = null;
		FileReader fr = null;

		File file = new File("ken.txt");
		try {
			fw = new FileWriter(file);
			fw.write("こんにちは\n");
			fw.write("また会いましょう");
			fw.flush();
			
			fr = new FileReader(file);
			char[] ch = new char[30];
			int size = fr.read(ch);
			for(char c : ch) {
				System.out.print(c);
			}
			
			System.out.println();
			System.out.println();
			System.out.println("読み込んだ文字数は" + size + "です");
			
		} catch (IOException e) {
			// TODO 後でエラー処理を行うこと！
			e.printStackTrace();
			
		} finally {
			try {
				if(fw != null) {
				fw.close();}
				
				if(fr != null) {
				fw.close();}
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

}
