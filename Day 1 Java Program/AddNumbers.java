package demo;
 class Addition {
        void SumOfTwoNumbers() {
        int number1 = 10;
        int number2 = 20;
        int result = number1 + number2;
        System.out.print("Sum of two numbers " + result);
    }
}
public class AddNumbers {
    public static void main(String arg[]) {
        Addition object = new Addition();
        object.SumOfTwoNumbers();
    }
}