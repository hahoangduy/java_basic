package Baitap52;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test59 {

    public static int swapNumbers(int[] nums, int k) {
        int left = 0;
        int countNumber0 = 0;
        int maxLength = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                countNumber0++;
            }
            while (countNumber0 > k) {
                if (nums[left] == 0) {
                    countNumber0--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        /*Cho một mảng nhị phân nums (chỉ chứa 0 và 1) và một số nguyên k.
        Bạn được quyền lật (đổi số 0 thành số 1) tối đa k lần. Hãy tìm độ dài của chuỗi số 1 liên tiếp dài nhất có thể tạo ra.
        Ví dụ 1:
        Input: nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0], k = 2
        Output: 6
        Giải thích: Lật hai số 0 ở vị trí index 5 và 10 (chữ số in đậm): [1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1]. Chuỗi số 1 liên tiếp dài nhất có độ dài là 6.
        Ví dụ 2:
        Input: nums = [0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1], k = 3
        Output: 10*/

        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int k1 = 2;
        System.out.println("Input 1: " + Arrays.toString(nums1) + " |K: " + k1);
        System.out.println("Output : " + swapNumbers(nums1, k1));
        System.out.println("");

        int[] nums2 = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}; int k2 = 3;
        System.out.println("Input 2: " + Arrays.toString(nums2) + " |K: " + k2);
        System.out.println("Output : " + swapNumbers(nums2, k2));
    }
}
