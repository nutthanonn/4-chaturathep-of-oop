public class Animal {
    private String ownerName;
    private String name;

    public Animal(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
