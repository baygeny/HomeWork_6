import java.util.Scanner;

public class LoanRepayment {
    static int loan;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input loan's value");
        loan = input.nextInt();
        System.out.println("Input payments' quantity");
        int quantityPayments = input.nextInt();
        int i = 1;
        while (loan > 0 && i <= quantityPayments) {
            System.out.println("Input payment's value");
            System.out.println(LoanRepayment(input.nextInt()));
            ++i;
        }

        if (i > quantityPayments) {
            System.out.println("The loan has expired. You will be charged a penalty" +
                    " in the amount of 10 percent of the loan balance");
        }
    }

        static String LoanRepayment(int payment) {
            loan = loan - payment;
            String message = "";
            if (loan > 0) {
                message = "You deposited $" + payment+ ". The loan amount is $" + loan;
            }
            if (loan == 0) {
                message = "You deposited $" + payment+ ". Your loan is repaid";
            }
            if (loan < 0) {
                message = "You deposited $" + payment+ ". Your loan is repaid. The overpayment amount is $" + Math.abs(loan);
            }
            return message;
        }

}
