public class Dog extends Animal {

    @Override
    public void makeSound() {

        System.out.println("Woof");
    }

    public void run() {
        System.out.println("Run Dog");
        super.run();
    }
}