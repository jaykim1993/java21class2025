package classpart09;

import java.util.Arrays;
import java.util.Random;

public class ClassEx09 {
	
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[");
		for(int i = 0 ; i<x.length ; i++) {
			x[i] = ran.nextInt(50)+51;
			System.out.print(x[i] + " ");
		}System.out.println("]");
		System.out.println(Arrays.toString(x));
	}
	
	
	public int total(int[] x) {
		int total= 0;
		for(int i = 0 ; i<x.length ; i++) {
			total += x[i];
		}
		return total;
	}
	
	public double avg(int[] x) {
		int sum = total(x); // 함수 호출, 매개변수 담기
		return (double)sum/x.length;
	}
	

	public int highest(int[] x) {
		int max = x[0];
		for(int i = 0 ; i<x.length ; i++) {
			if(x[i]>=max)max = x[i];
		}
		return max;
	}
	
	
	public int lowest(int[] x) {
		int min = x[0];
		for(int i = 0 ; i<x.length ; i++) {
			if(x[i]<=min)min = x[i];
		}
		return min;
	}
}
