import java.util.*;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];
        int index = -1;

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums, i, index);
                    break;
                }
            }

            reverse(nums, index + 1, nums.length - 1);
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}