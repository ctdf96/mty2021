package kadai;

public class CDStockUse {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.err.println("Please input one Keyword.");
			System.exit(-1);
			}
		
		CDStock cdStock = new CDStock();
		System.out.println("検索キーワードは" + args[0] +"です。");
				
				if(cdStock.searhCD(args[0]) ) {
					cdStock.disp();
				}
				else {
					System.out.println("該当商品はありません。");
				}
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
		for(int i=0;i < artists.length;i++) {
			if(keyword != null) {//null対策
			if(artists[i].equals(keyword)) {
				setCD(i);
				return true;
		} else if(titles[i].equals(keyword)){
				setCD(i);
				return true;
				}
			}
		}
		return false;

		}
	

//引数の要素番号を元に歌手名/アルバムタイトル/在庫数のインスタンス配列から該当データを取得し、
//それぞれのインスタンス変数に格納する
	public void setCD(int i) {
		this.artist = artists[i];
		this.title = titles[i];
		this.stock = stocks[i];
	}
	
	public void disp() {
		System.out.println();
			System.out.println("アーティスト名：" + artist);
			System.out.println("アルバム名　　：" + title);
			System.out.println("在庫数　　　　：" + stock + "枚");
	}
}