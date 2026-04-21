public class baitap18 {

    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 4, 2};
        double[] arr2 = new double[] {1.3, 4.2, 6.7};

        ArrayCalculator c = new ArrayCalculator();
        ArrayCalculator c2 = new ArrayCalculator();
        /*System.out.println(c.sumOfArray(arr1));
        System.out.println(c.sumOfArray(arr2));*/
        c.Dem();
        c.Dem();
        c2.Dem();
        c2.Dem();
    }
}
class ArrayCalculator {
    static int dem;

    public void Dem() {
        dem++;
        System.out.println(dem);
    }
    public static int sumOfArray(int arr[]) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double sumOfArray(double arr[]) {
        double sum = 0.0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
