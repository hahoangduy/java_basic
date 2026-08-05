package Baitap52;

import java.util.Arrays;

public class Test62 {
    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n-1; i++) {
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

    public static int sumNumsEqualTarget(int[] nums, int target) {
        bubbleSort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (currentSum == target) {
                    return target;
                }
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return closestSum;
    }


    public static void main(String[] args) {
        /*Cho một mảng số nguyên nums có độ dài n và một số nguyên target.
        Hãy tìm ba số trong nums sao cho tổng của chúng gần với target nhất.
        Trả về tổng của ba số đó. Bạn có thể giả định rằng mỗi đầu vào sẽ luôn có chính xác một nghiệm duy nhất.
        Ví dụ 1:
        Input: nums = [-1, 2, 1, -4], target = 1
        Output: 2
        Giải thích: Tổng gần target nhất là (-1) + 2 + 1 = 2 (khoảng cách với 1 là nhỏ nhất).
        Ví dụ 2:
        Input: nums = [0, 0, 0], target = 1
        Output: 0*/

        int[] nums1 = {-1, 2, 1, -4}; int target1 = 1;
        System.out.println("Input 1: " + Arrays.toString(nums1) + " |Target: " + target1);
        System.out.println("Output: " + sumNumsEqualTarget(nums1, target1));
        System.out.println("");
        int[] nums2 = {0, 0, 0}; int target2 = 1;
        System.out.println("Input 2: " + Arrays.toString(nums2) + " |Target: " + target2);
        System.out.println("Output: " + sumNumsEqualTarget(nums2, target2));
    }
}
