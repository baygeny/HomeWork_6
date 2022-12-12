import java.util.Scanner;

public class DeliveryOfGoods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number of customers");
        long numberCustomers = input.nextLong();
        System.out.println("The number of delivery routes is " + NumberDeliveryRoutes(numberCustomers));

    }
    static long NumberDeliveryRoutes(long number) {
        if (number > 0) {
            return number * NumberDeliveryRoutes(number - 1);
        }else {
            return 1;
        }
    }
}
