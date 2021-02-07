public class Engineer extends Person {
    String work;
    public Engineer(String name,int age , String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        
    }
    public void design(){
        System.out.println(name + " is work as a "+ work);
        System.out.println();
    }
}
