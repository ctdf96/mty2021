package kadai;

class Book{
	String title;
	String author;
	
	void setTitle(String data) {
		title = data;
	}
	
	void setAuthor(String data) {
		author = data;
	}
	
	String getTitle() {
		return title;
	}
	
	String getAuthor() {
		return author;
	}
}
class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setTitle("Java ABC");
		book1.setAuthor("Yamada Taro");
		System.out.println("Title  :" + book1.getTitle());
		System.out.println("Author :" + book1.getAuthor());
	}

}
