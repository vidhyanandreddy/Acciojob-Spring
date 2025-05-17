import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {

        //addition of three numbers
        int a = 3;
        int b = 5;
        int c = 3;
        int sum = a + b + c;
        System.out.println("Addition of two numbers is:" + sum);

        //find average of the marks
        float computer = 99;
        float science = 89;
        float physics = 76;
        float marks = (computer + science + physics) / 3;
        System.out.println("Average of the marks:" + marks);

        //Input using Scanner
        System.out.println("What is your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
    }
}
