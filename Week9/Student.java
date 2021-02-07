import java.util.Scanner;

public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public Student(String firstname,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public static void main(String[] args) {
        System.out.println("Enter your firstname ");
        Scanner scan = new Scanner(System.in);
        String firstname = scan.nextLine(); 
        System.out.println("Enter your lastname ");
        Scanner scan2 = new Scanner(System.in);
        String lastname = scan.nextLine();
        Student p = new Student(firstname, lastname);
        System.out.println(p.toString());
        System.out.println(firstname+" "+lastname);
    }
}
