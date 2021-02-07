public class Fish extends Pet {
    public Fish(String Name, String Species, String Color, int Age, String pet) {
        this.Name = Name;
        this .Species = Species;
        this.Color = Color;
        this.Age = Age;
        this.pet = pet;
    }
    public void isFish() {
        System.out.println("My fish " + Name+ " is love Salt water");
        System.out.println("Is Swim to the sea");
        System.out.println("Swim fast: "+ true);
        System.out.println(" ");
    }
}
