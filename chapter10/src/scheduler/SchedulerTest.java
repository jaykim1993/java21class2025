package scheduler;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 전화 상담 배분 방식을 선택하세요. R, L, P
		// R -> RoundRobin
		// L -> LeastJob
		// P -> PrionrityAllocation

        System.out.println("전화 상담 배분 방식을 선택하세요. R, L, P");
        String ch = scan.next();
        scan.close();
        Scheduler sch = null;
        if(ch.equals("R") || ch.equals("r")) {
        	sch = new RoundRobin();
        }
        else if(ch.equals("L") || ch.equals("l")) {
        	sch = new LeastJob();
        }
        else if(ch.equals("P") || ch.equals("p")) {
        	sch = new PriorityAllocation();
        }
        else {
        	System.out.println("입력값을 확인하세요");
        	return;
        }
    	sch.getNextCall();
    	sch.sendCallToAgent();
    	sch.lunch();
    	
	}

}

