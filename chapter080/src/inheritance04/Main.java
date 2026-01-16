package inheritance04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Main test = new Main();

        ArrayList<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("aaa", "이순신"));
        customerList.add(new Customer("bbb", "신사임당"));
        customerList.add(new GoldCustomer("ccc", "홍길동"));
        customerList.add(new GoldCustomer("ddd", "이율곡"));
        customerList.add(new VIPCustomer("eee", "김유신"));

        System.out.println("========보너스, 할인율 결과==========");
        for(Customer c : customerList) {
            test.showCustomer(c);
        }

        System.out.println();
        System.out.println("========보너스, 할인율 결과==========");
        for(Customer c : customerList) {
            test.calPrice(c);
        }
    }

    public void showCustomer(Customer cus) {
        cus.showCustomerInfo();
        System.out.println();
    }

    public void calPrice(Customer cus) {
        String pay = cus.calcPrice(10000);
        System.out.println(cus.customerName + "님이 " + pay + "원을 지불했습니다.");
        cus.showCustomerInfo();
        System.out.println();
    }
}

