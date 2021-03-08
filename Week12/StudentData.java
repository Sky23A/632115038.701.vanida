public class StudentData {
    public static void main(String[] args) {
        //Student object include name,age,gpa
        Student std01 = new Student("Mark",18,4.00);
        Student std02 = new Student("Jane",18,2.20);
        Student std03 = new Student("Peter",19,4.00);
        Student std04 = new Student("Mark",22,1.75);

    //Write the equal statement to test the object below
    //name
    System.out.println("---Name---");
    System.out.println(std01.equals(std02));
    System.out.println(std01.equals(std03));
    System.out.println(std02.equals(std04));
    System.out.println(std01.equals(std04));
    // age
    System.out.println("----Age----");
    System.out.println(std01.equals2(std02));
    System.out.println(std03.equals2(std04));
    System.out.println(std01.equals2(std03));
    
    //gpa
    System.out.println("----Gpa----");
    System.out.println(std01.equals3(std03));
    System.out.println(std02.equals3(std04));
    System.out.println(std02.equals3(std03));
    }
  
}
