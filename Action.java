public class Action {
    public static void main(String[] args) {
        Monkey Bob = new Monkey();
        Bob.speak();
        Bob.breathe();
        System.out.println("Monkey has " + Bob.legs + " legs.");
        Bob.size = "short";
        System.out.println("Monkey is " + Bob.getSize() + ".\n");

        Dog Cheese = new Dog();
        Cheese.speak();
        Cheese.breathe();
        System.out.println("Dog has " + Cheese.legs + " legs.");
        Cheese.size = "big";
        System.out.println("Monkey is " + Cheese.getSize() + ".\n");

        Bird Housefly = new Bird();
        Housefly.speak();
        Housefly.breathe();
        System.out.println("Bird has " + Housefly.legs + " legs.");
        Housefly.size = "small";
        System.out.println("Bird is " + Housefly.getSize() + ".\n");
    }
}
