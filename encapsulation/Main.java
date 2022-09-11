public class Main {
    public static void main(String[] args) {
        Animal obj = new Animal("Kawpad", "Nutthanon");

        System.out.println(obj.getName());
        System.out.println(obj.getOwnerName());

        obj.setName("Nutthanonnnnnnnnn");
        System.out.println(obj.getName());
    }
}