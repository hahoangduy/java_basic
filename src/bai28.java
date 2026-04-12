import java.util.*;

public class bai28 {
    public static void main(String[] args) {
        //1. khai bao list
        ArrayList<Integer> list = new ArrayList<>();

        //2. khai bao voi so luong pt ban dau
        ArrayList<Integer> list1 = new ArrayList<>(5);

        //3. khoi tao list voi cac pt ban dau
        ArrayList<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        System.out.println(list);
        System.out.println(list1);
        System.out.println(list2);

        //4. add them pt
        ArrayList<Integer> list3 = new ArrayList<>();
        // add
        list3.add(7);
        list3.add(1);
        list3.add(6);
        System.out.println(list3);
        // add vao vi tri chi dinh
        list3.add(0, 10);
        System.out.println(list3);

        //5. size: tra ve so pt cua list
        System.out.println("So pt cua list3 la: " + list3.size());

        //6. get(int index): tra ve gia tri list tai vi tri index
        System.out.println("Gia tri o vi tri index 3 la: ");
        System.out.println(list3.get(3));

        //7. remove(index)
        list3.remove(2);
        System.out.println("List3 sau khi xoa gia tri tai vi tri index 2 la: ");
        System.out.println(list3);

        //8. remove(1 pt duoc chi dinh)
        ArrayList<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("list4 = " + list4);
        list4.remove(Integer.valueOf(3));
        System.out.println("List 4 sau khi xoa so 3 la: " + list4);

        //9. set(index, element): thay doi thong tin
        ArrayList<Integer> list5 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        System.out.println("List 5 = " + list5);
        list5.set(2, 99);
        System.out.println("List 5 sau khi doi la: " + list5);

        //10. contains(): kiem tra 1 pt co ton tai trong list khong
        ArrayList<Integer> list6 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        boolean ktra = list6.contains(4);

        //11. Collections.sort(list): sap xep tang dan
        ArrayList<Integer> list7 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        Collections.sort(list7);
        System.out.println("List 7 sau sap xep la: " + list7);

        //12. indexOf(): Tim vi tri dau tien cua element trong list
        // neu khong tim thay tra ve -1
        ArrayList<Integer> list8 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        System.out.println(list8.indexOf(6));

        //13. duyet list
        // cach 1:
        ArrayList<Integer> list9 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        for (int pt : list9){
            System.out.println(pt);
        }
        System.out.println("----------------");

        // cach 2: khi can dung den cac chi so index
        ArrayList<Integer> list10 = new ArrayList<>(List.of(3, 5, 6, 7, 1, 2, 4, 6, 1));
        for (int i = 0; i < list10.size(); i++){
            int tam = list10.get(i);
            System.out.println(tam);
        }

    }
}
