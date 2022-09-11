# Inheritance

- การสืบทอดคลาส
  sub class จะได้คุณสมบัติจาก super class มาทั้งหมด ไม่ว่าจะเป็นการเรียกใช้ method ใน super class หรือ การใช้ Constructor ของ super class ก็ย่อมทำได้

### Sub Class จำเป็นต้องเหมือน Super class ทั้งหมด แต่ Super class ไม่จำเป็นต้องเหมือน Sub class ทั้งหมดก็ได้

- TL;DR คลาสลูกต้องมีทุกอย่างในคลาสแม่ แต่ คลาสแม่ไม่จำเป็นต้องมีทุกอย่างเหมือนคลาสลูก

## Example java code

```java
public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    private int leg = 4; //เพื่ม varible จาก Super class

    public int getLeg() {
        return leg;
    }

    public Dog(String name) { //จำเป็นต้องมี Contructor เพราะ super class มีให้รับค่า
        super(name); //ใช้ constructor จาก super class
        super.eat(); //เรียกใช้ method ใน constructor
    }
}

```
