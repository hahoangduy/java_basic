package Baitap53.Bai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    // time complexity: O(n) + O(mlogm)
    // n là số phần tử của heights phải duyệt qua
    // m là số phần tử của result phải duyệt qua
    public static ArrayList<Integer> lookingSea(int[] heights) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxHeight = 0;
        for (int i = heights.length-1; i >= 0; i--) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                result.add(i);
            }
        }
        Collections.sort(result);
        return result;
    }

    public static void main(String[] args) {
        /*Cho một mảng heights đại diện cho chiều cao của các tòa nhà xếp thành một hàng từ trái sang phải.
        Biển nằm ở bên phải của tòa nhà cuối cùng.
        Một tòa nhà có thể "nhìn ra biển" nếu không có tòa nhà nào nằm bên phải nó cao hơn hoặc bằng nó.
        Hãy trả về mảng chứa vị trí (index) của các tòa nhà nhìn được ra biển, sắp xếp tăng dần.
        Ví dụ:
        Input: heights = [4, 2, 3, 1]
        Output: [0, 2, 3]
        Giải thích:
        Tòa nhà số 0 (cao 4) cao hơn tất cả các tòa bên phải nó.
        Tòa số 1 (cao 2) bị tòa số 2 (cao 3) che khuất.
        Tòa số 2 và số 3 đều nhìn được biển.*/

        int[] heights = {4, 2, 3, 1};
        System.out.println("Input: " + Arrays.toString(heights));
        System.out.println("Output: " + lookingSea(heights));
    }
}
