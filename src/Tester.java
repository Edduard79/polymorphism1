public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        Animal animal1 = new Animal("Lion");

        animal1.animalSound();
        animal1.animalSound("low");
        animal1.animalSound("high");
        animal1.animalSound("idk");

    }
}
