package Array.Medium;
import java.util.*;
    public class sortcolor{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int low = 0;
            int mid = 0;
            int high = arr.length-1;

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            while(mid <= high){
                if(arr[mid] == 0){
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                }else if(arr[mid] == 1){
                    mid++;
                }else{
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--; 
                }
            }
            System.out.println(Arrays.toString(arr));
            sc.close();
        }
    } 