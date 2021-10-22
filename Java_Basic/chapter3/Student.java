public class Student {
    //field
        String name;	//名前
        char gender;	//性別
        int score;		//点数
        //ランク情報は出力時にメソッドで割り出す（フィールドに必要な情報ではない）
        
    //method
        Student(String tmpName, char tmpGender, int tempScore) {
        	name = tmpName;
            gender = tmpGender;
            score = tempScore;
            }
        
        void disp() {
    		
    		char tmpRank = getRank();//returnで返ってきた値を入れる変数
            System.out.println("名前："+ name);
            System.out.println("性別：" + gender);
            System.out.println("点数：" + score);
            System.out.println("成績：" + tmpRank);//returnで返ってきた値を表示
            System.out.println();}
            
        //定義の順番は自由
//        void input(String tmpName, char tmpGender, int tempScore) {
//        	name = tmpName;
//            gender = tmpGender;
//            score = tempScore;
//            }
            
        
            char getRank() {//rankはローカル変数のため外に知らせるには戻り値としてreturnで返す必要がある
            	char rank;
            	
            	if(score >= 80) {
            		rank = 'A';
            	} else if (score >= 60) {
            		rank = 'B';
            	} else if (score >= 40) {
            		rank = 'C';	
            	} else {
            		rank ='X';
            	}
            return rank ;            
        }
    }  