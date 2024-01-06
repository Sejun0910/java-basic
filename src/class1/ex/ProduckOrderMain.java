package class1.ex;

public class ProduckOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        ProductOrder order1 = new ProductOrder();
        order1.produckName = "김치";
        order1.price = 2000;
        order1.quantity = 2;
        orders[0] = order1;

        ProductOrder order2 = new ProductOrder();
        order2.produckName = "두부";
        order2.price = 3000;
        order2.quantity = 3;
        orders[1] = order2;

        ProductOrder order3 = new ProductOrder();
        order3.produckName = "고기";
        order3.price = 8000;
        order3.quantity = 1;
        orders[2] = order3;

        ProductOrder order4 = new ProductOrder();
        order4.produckName = "콜라";
        order4.price = 500;
        order4.quantity = 10;
        orders[3] = order4;

        int totalAmount = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.produckName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }

    }
}
