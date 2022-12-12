public class Calculator {
    public static void main(String[] args) {
       double [] array = Calculate(17, 37, 59);
        System.out.println("Return parameters divided by 5 are " + array[0] + ", " + array[1] + ", " + array[2]);

    }
    static double [] Calculate(int a, int b, int c) {
        double x = (double) a / 5;
        double y = (double) b / 5;
        double z = (double) c / 5;
        double [] array = {x, y, z};
        return array;
    }

}
