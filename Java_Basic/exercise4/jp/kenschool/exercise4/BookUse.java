package jp.kenschool.exercise4;

public class BookUse {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.setBook("3月のライオン");
		book1.disp();
		System.out.println();
		book2.setBook("銀の匙","荒川弘");
		book2.disp();
		System.out.println();
		book3.setBook("海街diary","吉田秋生",1000);
		book3.disp();
		
	}
}


class Book{
	
	String bookTitle;//タイトル
	String bookAuthor;//作者名
	int stockCount;//在庫数

	public void setBook(String bookTitle) {
		this.bookTitle = bookTitle;
		this.bookAuthor = "不明";
		this.stockCount = 0;
	}

	public void setBook(String bookTitle,String bookAuthor) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.stockCount = 0;
	}
	
	public void setBook(String bookTitle,String bookAuthor,int stockCount) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.stockCount = stockCount;
	}
	
	public void disp() {
		System.out.println("タイトル：" + bookTitle);
		System.out.println("作　者：" + bookAuthor);
		System.out.println("在庫数量：" + stockCount);
	}
	}
