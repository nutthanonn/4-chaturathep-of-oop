abstract class Animal {
    public int a = 10;
    public abstract int amount();
}


class Dog extends Animal {
    
    @Override
    public int amount() {
        System.out.println(a);
        return 0;
    }
}