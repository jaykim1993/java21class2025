package itemList;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ShoppingMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("aaa", "1111", 50000));
        users.add(new User("bbb", "1111", 80000));
        users.add(new User("ccc", "1111", 20000));
        users.add(new User("ddd", "1111", 10000));

        ItemList store = new ItemList();
        CartService cartService = new CartService();
        DecimalFormat df = new DecimalFormat("###,###");
        
        User loginUser = null;
        boolean run = true;

        while (run) {
            System.out.println("\n====== 그린 쇼핑몰 ======");
            System.out.println("[1] 로그인");
            System.out.println("[2] 로그아웃");
            System.out.println("[0] 종료");
            System.out.print("\n선택 : ");

            int sel = scan.nextInt();

            if (sel == 1) {
                System.out.print("아이디 : ");
                String id = scan.next();
                System.out.print("비밀번호 : ");
                String pw = scan.next();

                for (User u : users) {
                    if (u.getId().equals(id) && u.getPw().equals(pw)) {
                        loginUser = u;
                        System.out.println(u.getId() + "님 안녕하세요!");
                        boolean shopping = true;

                        while (shopping) {


                        	store.showItems();
                        	System.out.println("======================\n");
                            cartService.showCart(loginUser);
                            System.out.println("----------------------");
                            int total = cartService.getTotalPrice(loginUser);
                            System.out.println("총액 : " + df.format(total) + "원");
                            System.out.println(loginUser.getId() + "님의 보유금액 : " + df.format(loginUser.getBalance()) + "원");
                            System.out.println("\n======================");
                            System.out.println("[1] 장바구니 담기");
                            System.out.println("[2] 삭제");
                            System.out.println("[3] 초기화");
                            System.out.println("[4] 결제");
                            System.out.println("[0] 메인으로");
                            System.out.print("\n선택 : ");

                            int m = scan.nextInt();
                            if (m == 1) {
                                System.out.print("번호 : ");
                                int idx = scan.nextInt();
                                System.out.print("수량 : ");
                                int qty = scan.nextInt();

                                cartService.addItem(loginUser, store.getItem(idx), qty);
                            }
                            else if (m == 2) {
                                cartService.showCart(loginUser);
                                System.out.print("삭제 번호 : ");
                                int d = scan.nextInt();
                                cartService.removeItem(loginUser, d);
                            }
                            else if (m == 3) {
                                cartService.clearCart(loginUser);
                            }
                            else if (m == 4) {
                                int balance = loginUser.getBalance();

                                if (total == 0) {
                                    System.out.println("장바구니가 비어 있습니다.");
                                }
                                else if (total > balance) {
                                    System.out.println("금액이 부족합니다.");
                                    System.out.println("필요 금액 : " + df.format(total) + "원");
                                    System.out.println("보유 금액 : " + df.format(balance) + "원");
                                    // 화면이 바로 사라지는 문제 방지
                                    System.out.println("결제를 진행하려면 Enter를 누르세요...");
                                    scan.nextLine(); // nextInt() 후 남은 개행 제거
                                    scan.nextLine(); // Enter 입력 대기
                                }
                                else {
                                    int remain = balance - total;
                                    System.out.println("결제 완료!");
                                    System.out.println("결제 금액 : " + df.format(total) + "원");
                                    System.out.println("결제 후 잔액 : " + df.format(remain) + "원");
                                    // 화면이 바로 사라지는 문제 방지
                                    System.out.println("계속하려면 Enter를 누르세요...");
                                    scan.nextLine(); // nextInt() 후 남은 개행 제거
                                    scan.nextLine(); // Enter 입력 대기
                                }
                            }
                            else if (m == 0) {
                            	shopping = false;
                            }
                        }
                    }
                }
            }

            else if (sel == 2) {
                loginUser = null;
                System.out.println("로그아웃");
            }

            else if (sel == 0) {
                run = false;
            }
        }
        scan.close();
    }
}
