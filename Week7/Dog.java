public class Dog extends Pet{

    public Dog(String Name,String Species,String Color, int Age,String pet){
        this.Name = Name;
        this .Species = Species;
        this.Color = Color;
        this.Age = Age;
        this.pet = pet;
    }
    public void isDog(){
        
        System.out.println("My dog " + Name+ " is run to  the jungle");
        System.out.println("Smell bark Box Box!!");
        System.out.println("Short hair: "+ true);
        System.out.println(" ");
    }
}
