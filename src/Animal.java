public class Animal {
    private String animalName;

    public Animal(String animalName){
        this.animalName = animalName;
    }
    public void animalSound(){
        System.out.println(this.animalName + " does: Roarr!" );
    }

    public void animalSound(String intensity){
        String sound = this.animalName + " roar is: ";

            switch (intensity){
                case "high":
                    sound = sound + "Roarrrrr";
                    break;
                case "low":
                    sound = sound + "Roar";
                    break;
                default:
                    sound = sound + "Cannot reproduce it properly";
            }

        System.out.println(sound);

    }
}
