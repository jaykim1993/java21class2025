package ifexample;

import java.util.Random;

public class IfEx17 {

	public static void main(String[] args) {
		Random random = new Random();
		// 1~50 난수 생성
		int randomNum = random.nextInt(50)+1; 
		System.out.printf("문제 = %d%n", randomNum);
		// 난수 쪼개기
		int twoDigit = randomNum/10;
		int oneDigit = randomNum%10;
		int cnt = 0;
		
		// 판별
		if(twoDigit == 3 || twoDigit == 6 || twoDigit == 9) {
			cnt++;
		};
		if(oneDigit == 3 || oneDigit == 6 || oneDigit == 9) {
			cnt++;
		}
		if(cnt == 2) {
			System.out.printf("짝짝");
				}else if (cnt ==1){
					System.out.printf("짝");
				}else {
					System.out.println(randomNum);
				};
	};
}
