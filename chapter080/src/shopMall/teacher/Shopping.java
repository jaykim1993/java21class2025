package shopMall.teacher;

import java.util.Scanner;

public class Shopping extends UserMenu {

    Scanner scan = new Scanner(System.in);
    ItemManager im = new ItemManager();

    String mainMenu = "[1] 로그인\n[2] 로그아웃\n[3] 쇼핑\n[0] 종료";
    String shopMenu = "[1] 쇼핑목록\n[2] 장바구니\n[0] 뒤로가기";
    String managerMenu = "[1] 로그아웃\n[2] 아이템관리\n[3] 장바구니리스트";
    String itemMenu = "[1] 아이템추가\n[2] 아이템삭제\n[3] 아이템수정\n[0] 뒤로가기";

    // 관리자 계정 인덱스 (UserMenu 기준)
    static final int ADMIN_INDEX = 0;

    public Shopping() {}

    // 메인 메뉴
    public void menu() {
        while (true) {

            // 관리자 로그인 상태면 관리자 메뉴
            if (log == ADMIN_INDEX) {
                showManagerMenu();
                continue;
            }

            System.out.println("\n==== 쇼핑몰 ====");
            System.out.println(mainMenu);
            System.out.print("메뉴 선택: ");
            int select = scan.nextInt();

            switch (select) {
                case 1:
                    login();
                    break;
                case 2:
                    logout();
                    break;
                case 3:
                    if (log == -1) {
                        System.out.println("로그인 후 이용 가능합니다.");
                    } else {
                        shopMenu();
                    }
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // 쇼핑 메뉴
    public void shopMenu() {
        while (true) {
            System.out.println("\n==== 쇼핑 메뉴 ====");
            System.out.println(shopMenu);
            System.out.print("메뉴 선택: ");
            int select = scan.nextInt();

            if (select == 1) { // 쇼핑 목록
                im.printCategory();
                System.out.print("카테고리 선택 [뒤로가기 -1]: ");
                int caId = scan.nextInt();

                if (caId < 0 || caId >= im.category.size()||caId == -1) {
                    System.out.println("잘못된 카테고리입니다.");
                    continue;
                }

                // 아이템 출력
                for (int i = 0; i < im.itemList.size(); i++) {
                    if (im.category.get(caId).equals(im.itemList.get(i).category)) {
                        System.out.print("[" + i + "] ");
                        im.itemList.get(i).printInfo();
                    }
                }

                System.out.print("항목 선택 [뒤로가기 -1]: ");
                int itemId = scan.nextInt();
                if (itemId == -1) continue;
                im.addCart(super.id[log], caId, itemId);

            } else if (select == 2) { // 장바구니
            	im.showCart(id[log]);

            } else if (select == 0) {
                return;
            } else {
                System.out.println("입력을 확인하세요.");
            }
        }
    }

    // 로그인
    public void login() {
        if (log != -1) {
            System.out.println("이미 로그인 상태입니다.");
            return;
        }

        System.out.print("ID 입력: ");
        String inputID = scan.next();
        System.out.print("PW 입력: ");
        String inputPW = scan.next();

        for (int i = 0; i < id.length; i++) {
            if (inputID.equals(id[i]) && inputPW.equals(pw[i])) {
                log = i;
                break;
            }
        }

        if (log == -1) {
            System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
        } else if (log == ADMIN_INDEX) {
            System.out.println("관리자로 로그인하였습니다.");
        } else {
            System.out.println(id[log] + "님 환영합니다.");
        }
    }

    // 로그아웃
    public void logout() {
        if (log == -1) {
            System.out.println("이미 로그아웃 상태입니다.");
        } else {
            System.out.println("로그아웃 되었습니다.");
            log = -1;
        }
    }

    // 관리자 메뉴
    public void showManagerMenu() {
        while (true) {
            System.out.println("\n==== 관리자 메뉴 ====");
            System.out.println(managerMenu);
            System.out.print("메뉴 선택: ");
            int selectA = scan.nextInt();

            if (selectA == 1) { // 로그아웃
                logout();
                return;
            }

            else if (selectA == 2) { // 아이템 관리
                while (true) {
                    System.out.println("\n==== 아이템 관리 ====");
                    System.out.println(itemMenu);
                    System.out.print("메뉴 선택: ");
                    int selectB = scan.nextInt();

                    if (selectB == 1) { // 추가
                        im.printCategory();
                        System.out.print("카테고리 번호 선택: ");
                        int cateNum = scan.nextInt();

                        System.out.print("아이템 이름: ");
                        String newItemName = scan.next();

                        System.out.print("아이템 가격: ");
                        int newItemPrice = scan.nextInt();

                        im.addItem(newItemName, newItemPrice, im.category.get(cateNum));

                    } else if (selectB == 2) { // 삭제
                        im.printItemAll();
                        System.out.print("삭제할 아이템 번호: ");
                        int num = scan.nextInt();
                        im.removeItem(num);

                    } else if (selectB == 3) { // 수정
                        im.printItemAll();
                        System.out.print("수정할 아이템 번호: ");
                        int num = scan.nextInt();

                        System.out.print("새 이름: ");
                        String name = scan.next();

                        System.out.print("새 가격: ");
                        int price = scan.nextInt();

                        im.editItem(num, name, price);

                    } else if (selectB == 0) {
                        break;
                    } else {
                        System.out.println("잘못된 입력입니다.");
                    }
                }
            }

            else if (selectA == 3) { // 장바구니 리스트
                if (im.cartList.isEmpty()) {
                    System.out.println("장바구니가 비어있습니다.");
                } else {
                    System.out.println("==== 전체 장바구니 ====");
                    for (Cart u : im.cartList) {
                        System.out.printf("[%s] %s | %d원 | %d개\n",
                                u.userId, u.itemName, u.price, u.quantity);
                    }
                }
            }

            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
