package ref;

public class ProductOrderMain2 {

    public static void main(String[] args) {

        ProductOrder order1 = createOrder("두부", 2000, 2);
        ProductOrder order2 = createOrder("김치", 5000, 1);
        ProductOrder order3 = createOrder("콜라",1500,2);

        ProductOrder[] orders = {order1, order2, order3};

        printOrder(orders);

        System.out.println("총 결제 금액 : " + getTotalAmount(orders));
    }

    private static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = name;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    private static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    private static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
