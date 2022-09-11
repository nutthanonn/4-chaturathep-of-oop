# Encapsulation

- Encapsulation หรือ การห่อหุ้ม เป็นการ set private variable เพื่อไม่ให้ class อื่นสามารถเข้าถึงได้โดยตรง แต่จะสามารถเข้าถึงได้ผ่าน getter setter method
  เราสร้าง get set method เพื่อใช้ในการห่อหุ้ม variable

```java
public class Animal {
    private String ownerName;
    private String name;

    public Animal(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    public String getName() { // getter
        return name;
    }

    public void setName(String name) { // setter
        this.name = name;
    }

    public String getOwnerName() { //getter
        return ownerName;
    }

    public void setOwnerName(String ownerName) { // setter
        this.ownerName = ownerName;
    }
}

```

- ส่วนใหญ่การสร้าง getter setter method จะใช้ชื่อ get set ไว้ข้างหน้าเพื่อให้สื่อความหมาย

> TL;DR

- Encapsulation คือการป้องการการเข้าถึง class variable โดยตรง แต่จะเข้าถึงได้ผ่าน getter setter method
