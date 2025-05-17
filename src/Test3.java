import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter your ADSA marks:");
        int ADSA=marks.nextInt();
        System.out.println("Enter your JAVA marks:");
        int JAVA=marks.nextInt();
        System.out.println("Enter your OS marks:");
        int OS=marks.nextInt();
        System.out.println("Enter your SE marks:");
        int SE=marks.nextInt();
        int total=(ADSA+JAVA+OS+SE);
        System.out.println("Total marks is :"+total);
        float percentage=((ADSA+JAVA+OS+SE)/400.0f)*100;
        System.out.println("Percentage is :"+percentage);
    }
}
