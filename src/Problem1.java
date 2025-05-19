public class Problem1 {
    public void printArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }

    public static void main(String[] args) {
        Problem1 obj=new Problem1();
        int[] arr={2,4,5,7,8,9};
        obj.printArray(arr);
    }
}
