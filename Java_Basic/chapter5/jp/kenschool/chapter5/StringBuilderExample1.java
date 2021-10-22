package jp.kenschool.chapter5;

public class StringBuilderExample1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.reverse();
		sb.insert(3, "aaa");
		sb.append("zzz");
		System.out.println("sb = " + sb);
	}

}
