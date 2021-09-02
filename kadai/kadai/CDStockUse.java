package kadai;

public class CDStockUse {

	public static void main(String[] args) {
		if(args.length == 0) {
			
			System.out.println("please input one number.");
			System.exit(-1);
			} else {
				
				
				CDStock zaiko1 = new CDStock();
				String keyword = null;
				System.out.println("検索キーワードは" + keyword +"です。");
			}
	}


class CDStock{
	String[] artists = new String[] {"嵐","EXILE","AKB48","ももいろクローバーZ","BON JOVI","2PM"};//歌手名
	String[] titles = new String[] {"Popcorn","願いの塔","1830m","5TH DIMENSION","What About Now","LEGEND OF 2PM"};//アルバムタイトル
	long[] stocks = new long[] {100,150,50,200,75,30};//在庫数
	String artist;//歌手名
	String title;//アルバムタイトル
	long stock;//在庫数
	
	public boolean searhCD(String keyword) {
		if(keyword.equals(artists)) {
//
//			
//			
//			
//			
//			
		}else if(keyword.equals(titles)){
//
//			
//			
//			
//			
//			
//			
		} else {
		return false;}
		return false;
		}

	


	public void setArtist(String artist) {
		this.artist = artist;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public void setStock(long stock) {
		this.stock = stock;
	}

	
		public void disp() {
			System.out.println();
			System.out.println("アーティスト名：" + artist + "です。");
			System.out.println("アルバム名　　：" + title + "です。");
			System.out.println("在庫数　　　　：" + stock + "です。");
			System.out.println("Please input one Keyword.");
			System.exit(-1);
	}
}}