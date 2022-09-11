
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void eat(){
        System.out.println("I can eat");
    }
}


class Dog extends Animal {
    private int leg = 4;

    public int getLeg() {
        return leg;
    }

    public Dog(String name) {
        super(name);
        super.eat();
    }

    public void sound() {
        System.out.println("Bark! Bark Bark Bark....");
    }
}