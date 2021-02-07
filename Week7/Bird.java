public class Bird extends Pet {
    public Bird(String Name,String Species,String Color, int Age,String pet){
        this.Name = Name;
        this .Species = Species;
        this.Color = Color;
        this.Age = Age;
        this.pet = pet;
    }
    public void isBird(){
        System.out.println("My bird " + Name+ " is from Canada");
        System.out.println("Is speak to me ");
        System.out.println("Is can fly : "+ true);
        System.out.println(" ");
    }
    
}
