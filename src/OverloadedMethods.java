public class OverloadedMethods {

    public static void main(String[] args) {
        double averageLong = OverloadMethod(-4,2,1,1);
        double averageDouble = OverloadMethod(1,-3,1);
        double averageInt = OverloadMethod(1,1,-5,1,1);
        System.out.println(averageLong);
        System.out.println(averageDouble);
        System.out.println(averageInt);

        System.out.println(FindMinMaxMiddle(averageLong, averageDouble, averageInt));
    }
    static double OverloadMethod(double a, double b, double c){
        return (a + b + c) / 3;
    }

    static double OverloadMethod(long a, long b, long c, long d) {
        return (double) (a + b + c + d) / 4;
    }

    static double OverloadMethod(int a, int b, int c, int d, int e) {
        return (double) (a + b + c + d + e) / 5;
    }

    static String FindMinMaxMiddle(double a, double b, double c) {
        double middle = 0, max = 0, min = 0;
        String message;
        if ((a < c && a > b) || (a > c && a < b)) {
             middle = a;
             max = Math.max(c, b);
             min = Math.min(c, b);
        }

        if ((c < a && c > b) || (c > a && c < b)) {
             middle = c;
             max = Math.max(a, b);
             min = Math.min(a, b);
        }

        if ((b < a && b > c) || (b > a && b < c)) {
            middle = b;
            max = Math.max(a, c);
            min = Math.min(a, c);
        }
        message = "Min value is " + min + "\nMax value is " + max + "\nMiddle value is " + middle;

        if (a == c && a == b) {
            message = "All values are equal " + a;
        }

        if (a == c && a < b) {
            max = b;
            min = a;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        if (a == c && a > b) {
            max = a;
            min = b;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        if (a == b && a < c) {
            max = c;
            min = a;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        if (a == b && a > c) {
            max = a;
            min = c;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        if (b == c && b < a) {
            max = a;
            min = b;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        if (b == c && b > a) {
            max = b;
            min = a;
            message = "Min value is " + min + "\nMax value is " + max;
        }

        return message;



    }
}
