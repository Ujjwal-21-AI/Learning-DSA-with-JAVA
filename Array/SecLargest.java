package Array;
import java.util.*;
public class SecLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int SecLargest = -1;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                SecLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > SecLargest){
                SecLargest = arr[i];
            }
        }
        System.out.println("Second largest: " + SecLargest);


        int smallest = arr[0];
        int SecSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < smallest){
                SecSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest && arr[i] < SecSmallest){
                SecSmallest = arr[i];
            }
        }
        System.out.println("Second smallest: " + SecSmallest);
        sc.close();
    }
}
