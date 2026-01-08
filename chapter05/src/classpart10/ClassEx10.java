package classpart10;

public class ClassEx10 {
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = { 92, 38, 87, 100, 11};
	
	ClassEx10 () {};
	
	public int scoreMax() {
		int maxScore = arScore[0];
		int maxIndex = 0;
		for(int i = 0; i<arScore.length ; i++) {
			if(maxScore <= arScore[i]) {
				maxScore = arScore[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public int scoreMin() {
		int minScore = arScore[0];
		int minIndex = 0;
		for(int i = 0; i<arScore.length ; i++) {
			if(minScore >= arScore[i]) {
				minScore = arScore[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public int scoreScan(int hakbun) {
	    for(int i = 0; i < arHakbun.length; i++) {
	        if(hakbun == arHakbun[i]) {
	            return i; // 해당 학번 발견 시 인덱스 반환
	        }
	    }
	    return -1; // 해당 학번 없을 경우 -1 반환
	}

}
