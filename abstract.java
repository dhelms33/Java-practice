class Animal {
    public void makeSound() {
        System.out.println("...");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("BARK!");
    }
}