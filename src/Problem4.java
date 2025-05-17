public class Problem4 {
    public  int findMinimum(int[] arr){
        if (arr==null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min=arr[0];
        for (int i=1;i< arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={5,9,3,15,0,2};
        Problem4 obj=new Problem4();
        System.out.println(obj.findMinimum(arr));
    }
}
