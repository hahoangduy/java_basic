public class baitap17 {
    public static void main(String[] args) {
        Student s = new Student("Duc", 28);
        s.display();
        Student s1 = new Student("Duy", 20);
        s1.display();
        String[] mang = new String[3];

        mang[0] = "Duc";
        mang[1] = "Duy";
        mang[2] = "Long";
    }
}
class Student {
    String name;
    private int age;
    public Student(String name, int age) {
       this.name = name;
       this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

