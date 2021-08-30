package jp.kenschool.exercise3;

public class MyConstClass{
	private String expression;
	public MyConstClass(String tmp) {
		this.expression = tmp;
	}

	public String calcMethod(int value1, int value2) {
		int ans = value1 *value2;
		String message = this.expression + ans;
		return message + ans;
		}
	}
