package Baitap52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test58 {

    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public static ArrayList<List<Integer>> threeElements(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int k = j + 1;
                while (k < nums.length) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        k++;
                    } else
                        k++;
                }
            }
        }
        return result;
    }

    public static ArrayList<List<Integer>> threeElements2(int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        bubbleSort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng số nguyên nums. Hãy tìm tất cả các bộ ba phần tử [nums[i], nums[j], nums[k]] sao cho i != j, i != k, j != k và nums[i] + nums[j] + nums[k] == 0.
        Ví dụ 1:
        Input: nums = [-1, 0, 1, 2, -1, -4]
        Output: [[-1, -1, 2], [-1, 0, 1], [0, 1, -1]]
        Giải thích: * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
        nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0
        nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
        Ví dụ 2:
        Input: nums = [0, 1, 1]
        Output: []
        Giải thích: Không có bộ ba nào có tổng bằng 0.*/

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        System.out.println("Input 1: " + Arrays.toString(nums1));
        System.out.println("Output 1: " + threeElements(nums1));
        System.out.println("Output 2: " + threeElements2(nums1));
        System.out.println();
        int[] nums2 = {0, 1, 1};
        System.out.println("Input 2: " + Arrays.toString(nums2));
        System.out.println("Output: " + threeElements(nums2));
        System.out.println("Output 2: " + threeElements2(nums2));
    }
}
