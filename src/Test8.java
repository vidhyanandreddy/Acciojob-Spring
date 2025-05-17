import java.util.*;
public class Test8 {
    public void printArray(int[] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    public void arrayDemo(){
//        int[] marks=new int[5]; //memory allocation....
//        marks[0]=5;
//        marks[1]=3;
//        marks[2]=6;
//        marks[3]=9;
//        marks[4]=4;
//        printArray(marks);
//    }
    public static void main(String[] args) {
        Test8 arrUtil=new Test8();
//        arrUtil.arrayDemo();
        arrUtil.printArray(new int[] {5,7,9,3,0});
    }
}
