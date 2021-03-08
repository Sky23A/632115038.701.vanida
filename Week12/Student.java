public class Student {
    String name ;
    int age ;
    double gpa;
    public Student(){
        //
    }
    public Student(String name , int age,double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public double getGpa(){
        return gpa;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getName() == ((Student) obj).getName();
    }
    public boolean equals2(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getAge() == ((Student) obj).getAge();
    }
    public boolean equals3(Object obj){
        if(obj == null){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.getGpa() == ((Student) obj).getGpa();
    }

}
