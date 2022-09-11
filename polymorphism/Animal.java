public class Animal {
    public void sound() {
        System.out.println("Meaw! Meaw Meaw...");
    }    
}


class Dog extends Animal {
    
    @Override
    public void sound() {
        System.out.println("Bark! Bark Bark...");
    }
}