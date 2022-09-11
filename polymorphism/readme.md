# Polymorphism

- แบ่งออกเป็น 2 ส่วนหลักๆ
  1. Overriding
  2. Overloading

## Overriding

- การทำ override จะต้องมาพร้อมกับ inheritance เสมอ หลักการคือ ไปเปลี่ยนการทำงานของ method นั้นๆให้เปลี่ยนไป เช่น

```java
public class Animal {
    public void sound(){
        System.out.println("Meaw! Meaw Meaw...");
    }
}

class Dog extends Animal {
    @Override
    public void sound(){
        System.out.println("Bark! Bark Bark...");
    }
}
```

- สังเกตุได้ว่าเมื่อเราสร้าง dog object แล้วเรียก obj.sound(); มันจะเป็น `Bark! Bark Bark...` เพราะ เราได้ไปเปลี่ยนการทำงานของ method ด้วยการ override ทับลงไปเรียบร้อย

## Overloading

- การทำ overloading เป็นการสร้าง method ชื่อเหมือนกัน แต่รับ parameter แตกต่างกัน โดยเราจะมอง 2 ตัวนี้เป็นคนละ method แต่ชื่อเดียวกัน การทำ overloading ไม่จำเป็นต้อง inheritance ก็ทำได้ เช่น

```java
public static int sum(int a, int b){
    return a+b;
}

public static int sum(int a, int b, int c) {
    return a + b + c;
}
```

- เมื่อเราเรียก `sum(1,2)` ผลลัพธ์ที่ได้ คือ `3`
- เมื่อเราเรียก `sum(1,2,3)` ผลลัพธ์ที่ได้ คือ `6`

> TL;DR

1. Overriding **ชื่อ method เดียวกัน มาพร้อมกับ inheritance**
2. Overloading **ชื่อ method เดียวกัน parameter ต่างกัน**
