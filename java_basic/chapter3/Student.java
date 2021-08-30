public class Student {
    //field
        String name;	//名前
        char gender;	//性別
        int score;		//点数
        
    //method
        Student(String tmpName, char tmpGender, int tempScore) {
        	name = tmpName;
            gender = tmpGender;
            score = tempScore;
            }
        
        void disp() {
    		
    		char tmpRank = getRank();
            System.out.println("名前："+ name);
            System.out.println("性別：" + gender);
            System.out.println("点数：" + score);
            System.out.println("成績：" + tmpRank);
            System.out.println();}
            
        //定義の順番は自由
//        void input(String tmpName, char tmpGender, int tempScore) {
//        	name = tmpName;
//            gender = tmpGender;
//            score = tempScore;
//            }
            
        
            char getRank() {
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