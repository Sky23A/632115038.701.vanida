public class Pet {
    String Name ; 
    String Species;
    String Color;
    int Age;
    String pet;
    public Pet(){
        //
    }
    public Pet(String Name,String Species,String Color, int Age ,String pet){
        this.Name = Name;
        this .Species = Species;
        this.Color = Color;
        this.Age = Age;
        this.pet = pet;
    }
    public void isData(){
        System.out.println(pet);
        System.out.println("Name: "+Name + "Species: "+Species +"Color: "+Color+"Age: "+Age);  
    }
 
}
   