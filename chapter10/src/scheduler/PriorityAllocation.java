package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skil l이 가장 높은 상담원의 대기열에 앞에 우선 배분합니다.");
	}
	@Override
	public void lunch() {
		System.out.println("점심시간입니다.");
	}
}
// Priority Allocation (우선순위 배분)
	// 고객 또는 상담원에 우선순위를 두고 배분
	// 중요도