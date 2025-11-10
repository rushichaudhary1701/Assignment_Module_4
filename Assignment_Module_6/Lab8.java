import java.util.Scanner;

class Students {
    String name;
    int age;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}

public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Students s = new Students();

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter age: ");
        s.age = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        s.display();
    }
}
