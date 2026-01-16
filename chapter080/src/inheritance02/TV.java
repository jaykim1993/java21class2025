package inheritance02;

public class TV {

		protected int size; //인치
		
		public TV() {}
		public TV(int size) {
		this.size = size;
		}
		
		
		public int getSize() {
		return size;
		}
		
		public void setSize(int size)
		{
		this.size = size;
		}
		
}

//👉 생성자에서 초기화할 때는 super()가 정석
//👉 생성 이후 값 변경은 setter 사용
//✔ 생성자 초기화 → super()
//✔ 상태 변경 → setter
//✔ 필수값 → 생성자로 강제
//✔ 선택값 → setter 허용