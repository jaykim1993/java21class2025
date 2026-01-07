package methodClass;

public class Return02 {
	// 배열로 된 데이터 타입을 매개변수로 사용하는 함수 작성
	public int test(int[] arr) {
		int cnt = 0;
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]%4 == 0) {
				cnt ++;
			}
		}
		// cnt = 4의 배수의 갯수
		return cnt;
		}
	
	public static void main(String[] args) {
		Return02 re02 = new Return02();
		int[] ar0 = {10,12,14,56,70,100};
		System.out.println(re02.test(ar0));
	}
}
