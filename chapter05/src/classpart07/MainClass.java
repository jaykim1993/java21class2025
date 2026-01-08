package classpart07;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {   // ⭐ 프로그램 전체 루프 (다시 켜기)

            Classpart07 classpart = new Classpart07();
            boolean run = true;
            classpart.state = "로그아웃";

	   		 System.out.println("=========");
	   		 System.out.println("[MEGA BANK]");
	   		 System.out.println("=========");

            while (run) {
                classpart.renderInfo();
                classpart.renderOption();

                switch (classpart.select) {
                    case 1: classpart.signup(); break;
                    case 2: classpart.login(); break;
                    case 3: classpart.logout(); break;
                    case 4: classpart.deposit(); break;
                    case 5: classpart.transfer(); break;
                    case 6: classpart.balance(); break;
                    case 0:
                        run = false;
                        break;
                    default:
                        System.out.println("[0] ~ [6] 중 선택하세요.");
                }
            }

            // 종료 재확인
            System.out.println("프로그램을 종료합니다.");
            System.out.print("다시 실행하시겠습니까? (Y/N) : ");
            String again = scan.next();

            if (!again.equalsIgnoreCase("Y")) {
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }

            System.out.println("\n");
        }

        scan.close();
    }
}
