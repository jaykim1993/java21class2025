package example;


public class Arrtest06 {

	public static void main(String[] args) {
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores = { 87, 11, 45, 98, 23};
		
		int highestScore = 0;
		int scoreofHakbun = 0;
		
		for(int i = 0 ; i<hakbuns.length ; i++) {
			if(highestScore < scores[i]) {
				highestScore = scores[i];
				scoreofHakbun = hakbuns[i];
			}; 
		}
		System.out.println(scoreofHakbun + "번 (" + highestScore + "점)");

		
	}
	
}
