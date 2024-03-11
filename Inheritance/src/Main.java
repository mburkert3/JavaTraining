public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Dog retriever = new Dog("Retriever", 30, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Dog sheperd = new Dog("Sheperd", 60, "Curly", "Non-Swimmer");
        doAnimalStuff(sheperd, "fast");

    }

        public static void doAnimalStuff(Animal animal, String speed) {
            animal.makeNoise();
            animal.move(speed);
            System.out.println(animal);
            System.out.println("_ _ _ _");

        }


}
