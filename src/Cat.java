public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    void run() {
        System.out.println("Run Cat");
        super.run();
    }
}
