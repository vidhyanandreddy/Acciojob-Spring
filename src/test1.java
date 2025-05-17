public class test1 {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("welcome to java");
        int a=10;
        int b=20;
        int sum=a+b;
        int diff=a-b;
        int mul=a*b;
        int div=b/a;
        int n=10;
        System.out.println("Addition of two numbers:"+sum);
        System.out.println("Addition of two numbers:"+diff);
        System.out.println("Addition of two numbers:"+mul);
        System.out.println("Addition of two numbers:"+div);
        System.out.println("*\n**\n***\n****\n*****");
        for (int i=1;i<n;i++){
            System.out.printf("%d * %d=%d\n",n,i,n*i);
        }
        String firstname="vidhyanand";
        String lastname="reddy";
        System.out.println("what is your name?\n"+firstname+lastname);
    }
}
