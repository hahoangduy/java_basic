package Baitap52;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test37 {

    public static int[] hashMap(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], 1);
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                resultList.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        /*Cho hai mảng số nguyên nums1 và nums2. Hãy trả về một mảng chứa các phần tử chung xuất hiện ở cả hai mảng.
        Kết quả trả về không được chứa các số trùng lặp (mỗi số chỉ xuất hiện 1 lần trong mảng kết quả), thứ tự các số có thể ngẫu nhiên.
        Ví dụ 1:
        Input: nums1 = [1, 2, 2, 1], nums2 = [2, 2]
        Output: [2]
        Ví dụ 2:
        Input: nums1 = [4, 9, 5], nums2 = [9, 4, 9, 8, 4]
        Output: [9, 4] (hoặc [4, 9])*/
        System.out.println("Ví dụ 1: ");
        int[] nums1 = {1, 2, 2, 1}; int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int[] result1 = hashMap(nums1, nums2);
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result1));
        System.out.println();
        System.out.println("Ví dụ 2: ");
        int[] nums1_1 = {4, 9, 5}; int[] nums2_1 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(nums1_1));
        System.out.println(Arrays.toString(nums2_1));
        int[] result2 = hashMap(nums1_1, nums2_1);
        System.out.print("Output: ");
        System.out.println(Arrays.toString(result2));
    }
}
