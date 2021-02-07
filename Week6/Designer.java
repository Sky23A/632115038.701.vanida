public class Designer extends Person {
    String dior;
    public Designer(String name,int age , String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
        
    }
    public void diorWork(){
        System.out.println(name + " is a famous designer of "+ dior+" .");
        System.out.println();
    }
}
