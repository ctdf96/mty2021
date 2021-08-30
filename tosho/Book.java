package tosho;

public class Book {
		private String bookCode; //書籍コード
		private String title; //タイトル
		private String author; //著者名
		private String publisher; //出版社名
		
		public Book(String bookCode, String title, String author, String publisher) {
			this.bookCode = bookCode;
			this.title = title;
			this.author = author;
			this.publisher = publisher;
		}

		public void setBookCode(String bookCode) {
		this.bookCode =bookCode;
		}
		
		public String getBookCode() {
			return this.bookCode;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}
		
	}
