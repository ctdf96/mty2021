package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorBasic {

	public static void main(String[] args) {

		// Comparatorインタフェースを使うといろいろソートできる
		// abstractメソッドのcompare()を実装して使う
		// オブジェクトの大小を比較し、結果をint型で返すようにする
		// ２つを比較し左が小さければ-1
		// 　　　　　　　右が小さければ-1
		// 　　　　　　　同じなら0
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(100);
		list.add(40);
		list.add(2);
		
		//list.sort(comparetor);	// sortメソッドは通常、このように使う
		
		//ソートのルールを決める
		 Comparator<Integer> comparator1 = new Comparator<>() {
			 public int compare( Integer o1, Integer o2 ) {
				 return Integer.valueOf(o1).compareTo( Integer.valueOf(o2));
			 }
		 };
		 
		 list.sort(comparator1);
		 System.out.println(list);
		
		 //その他の簡単な例
		 //文字数の少ない順で並び替えとか
		 
			List<String> list2 = new ArrayList<>();
			list2.add("Ehiumeken");
			list2.add("Mikan");
			list2.add("Matsuyamashi");
			list2.add("Imabarishi");
			list2.add("Ozushi");
			
		 Comparator<String> comparator2 = new Comparator<>() {
			 public int compare( String o1, String o2 ) {
				 if( o1.length() < o2.length() ) return -1;
				 else if( o1.length() < o2.length() ) return 1;
				 else return 0;
			 }
		 };
		 
		 list2.sort(comparator2);		 
		 System.out.println(list2);

		 //もしくは
		 Collections.sort(list2, comparator2);
		 System.out.println(list2);
	}

}
