package day20_constructor;

public class Cat {
    String name;
    String brand;
    String color;
    int age;


   public Cat() {
      this(null,null);
       System.out.println("parametresiz constructor");


    }

    public Cat(String name, String brand) {
        this(null,null,"black white",3);

        this.brand = brand;
        System.out.println("Iki parametreli constructor");
    }

    public Cat(String name, String brand, String color, int age) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.age = age;
        System.out.println("dort parametreli constructor");
    }







    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
