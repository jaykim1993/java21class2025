package arrayListEx02;


public class Subject {
	String subjectNameA;
	int subjectScoreA;
	String subjectNameB;
	int subjectScoreB;


	
	public Subject() {}
	public Subject(String subjectNameA, String subjectNameB, int subjectScoreA, int subjectScoreB ) {
		this.subjectNameA = subjectNameA;
		this.subjectNameB = subjectNameB;
		this.subjectScoreA = subjectScoreA;
		this.subjectScoreB = subjectScoreB;
	}


	
	public void printScore() {
		System.out.printf("과목명 : %10s점수 : %10d점%n", subjectNameA, subjectScoreA );
		System.out.printf("과목명 : %10s점수 : %10d점%n", subjectNameB, subjectScoreB );
		System.out.println();
	}
}
