public class Test9 {
    public static void main(String[] args) {
        float[] marks={45.7f,90.9f,45.7f,97.7f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }
        System.out.println("The value of sum is "+sum);
    }
}
