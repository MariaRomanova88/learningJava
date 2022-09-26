package school.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("product1", 5.0);
        payment.addProduct("product2", 3.5);
        payment.addProduct("product3", 4.0);

        payment.showProducts();
    }
}
