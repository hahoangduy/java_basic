package Baitap52;

public class Test52 {

    public static boolean twoPoint(String s) {
        String temp = s.toLowerCase();
        int i = 0;
        int j = temp.length()-1;
        while (i <= j) {
            char cI = temp.charAt(i);
            char cJ = temp.charAt(j);
            if ('z' - cI > 26) {
                i++;
            } else if ('z' - cJ > 26) {
                j--;
            }
            else if (cI != cJ) {
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*Cho một chuỗi s. Hãy kiểm tra xem chuỗi này có phải là chuỗi đối xứng hay không.
        Một chuỗi được coi là đối xứng nếu sau khi chuyển tất cả chữ hoa thành chữ thường và loại bỏ tất cả các ký tự không phải là chữ cái hoặc chữ số,
        nó đọc từ trái sang phải giống hệt như đọc từ phải sang trái.
        Ví dụ 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Giải thích: Sau khi lọc và viết thường, chuỗi trở thành "amanaplanacanalpanama", đọc ngược lại vẫn giống hệt.
        Ví dụ 2:
        Input: s = "race a car"
        Output: false
        Giải thích: Chuỗi sau khi lọc là "raceacar", đọc ngược lại không giống.*/

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Ví dụ 1: " + s1);
        System.out.println("Output: " + twoPoint(s1));
        System.out.println();
        String s2 = "race a car";
        System.out.println("Ví dụ 2: " + s2);
        System.out.println("Output: " + twoPoint(s2));
    }
}
