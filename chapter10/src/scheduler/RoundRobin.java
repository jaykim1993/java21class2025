package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
	
	@Override
	public void lunch() {
		System.out.println("점심시간입니다.");
	}
}

// Round Robin (순차 배분 방식)
	// 상담원에게 차례대로 순서대로 전화를 배분하는 방식
	// 공평