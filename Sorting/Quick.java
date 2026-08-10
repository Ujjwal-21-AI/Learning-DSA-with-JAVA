import java.util.*;
class Solution{
    public void quickSort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr,low,high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
        }
    }
public class Quick{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter "+n+" space-separated integers:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution sol = new Solution();
        sol.quickSort(arr, 0, arr.length-1);
        System.out.println("Sorted Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}