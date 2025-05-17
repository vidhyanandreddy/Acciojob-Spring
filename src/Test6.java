import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        //Statements......

        //if and else loop
//        int a=10;
//        if (a==5){
//            System.out.println("It is True");
//        }else {
//            System.out.println("It is False");
//        }

        //else if loop
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your Current Age:");
//        int age=sc.nextInt();
//        if (age<12){
//            System.out.println("Your still a child.....");
//        } else if (age>18 && age<40) {
//            System.out.println("Your are Adult....");
//            System.out.println("You can drive a vehicals....");
//        } else if (age>40) {
//            System.out.println("You are getting old.....");
//        } else if (age>55) {
//            System.out.println("You get Pension");
//        }else{
//            System.out.println("Invalid Age.....");
//        }

        //switch statement....
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your current age:");
//        int age=sc.nextInt();
//        switch (age){
//            case 10:
//                System.out.println("You are still child");
//                break;
//            case 18:
//                System.out.println("You are an Adult");
//                break;
//            case 24:
//                System.out.println("You are going to search a job.....");
//                break;
//            case 50:
//                System.out.println("you are ready to get retairment of your job...");
//                break;
//            case 60:
//                System.out.println("you will get pension form the govt...");
//                break;
//            default:
//                System.out.println("Enjoy your life.....");
//        }

        //days....
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter your current day:");
//        int day=sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("you are entered wrong number....");
//        }

        //endsWith....
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Website name:");
        String website=sc.nextLine();
        if (website.endsWith(".in")){
            System.out.println(website);
            System.out.println("It is Indian Website.....");
        } else if (website.endsWith(".org")) {
            System.out.println(website);
            System.out.println("It is Organisation Website....");
        } else if (website.endsWith(".com")) {
            System.out.println(website);
            System.out.println("It is Commercial Website.....");
        }
    }
}
