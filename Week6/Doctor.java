public class Doctor extends Person {
    String doc;
    public Doctor(String name,int age , String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        
    }
    public void specialty(){
        System.out.println(name + " is Specialty doctors "+ doc+" in hospital.");
        System.out.println();
    }
}
