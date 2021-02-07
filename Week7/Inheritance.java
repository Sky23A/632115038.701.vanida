public class Inheritance {
    public static void main(String[] args) {
        Dog doggy = new Dog("Lucky","Pooddle" , "brown", 2 ,"My dog");
        doggy.isData();
        doggy.isDog();

        Fish fish = new Fish("Nemo","Ocellaris clownfish", "Orange", 1,"My fish");
        fish.isData();
        fish.isFish();

        Bird bird = new Bird("Scuttle", "Seagull","White", 5, "My bird");
        bird.isData();
        bird.isBird();
    }

}
