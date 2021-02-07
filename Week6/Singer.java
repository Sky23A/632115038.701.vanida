public class Singer extends Person {
    String song;
    public Singer(String name,int age , String gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void Music(){
        System.out.println(name + " is loves to make "+ song+" music.");
        System.out.println();

    }
}
