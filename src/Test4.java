import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        //increase numbers by using ++
        char ch='v';
        System.out.println(++ch);
        int num=10;
        System.out.println(++num+9);
        // div mul the numbers
        int a=7/4 * 9/2;
        System.out.println(a);
        float b=7/4.0f * 9/2.0f;
        System.out.println(b);
        //increase and add the characters
        char let='c';
        let=(char)(let+8);
        System.out.println(let);
        //boolean expresion
        Scanner n=new Scanner(System.in);
        System.out.println("Enter your number:");
        int v=n.nextInt();
        System.out.println(v>99);
    }
}
