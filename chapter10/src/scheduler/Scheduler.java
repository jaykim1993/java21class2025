package scheduler;

public interface Scheduler {
	void getNextCall();
	void sendCallToAgent();
	void lunch();
}
// 실제 콜센터는 혼합 방식 사용

// Priority → LeastJob → RoundRobin
	// 1. VIP 먼저 배정
	// 2. 그중 가장 여유 있는 상담원 선택
	// 3. 순번으로 배정