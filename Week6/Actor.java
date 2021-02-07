public class Actor extends Person {
    String movie;
    public Actor(String name,int age , String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    
    public void Actress(){
        System.out.println(name + " is a leading actor in  "+ movie+" on Nexfilx.");
        System.out.println();
    }
}
