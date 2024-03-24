package day2;
public class Animal {
    private int size;
    private int age;
    private String color;
    public Animal() {
        size = 5;
        age = 2;
        color = "green";
    }
    public Animal(int size1, int age1, String color1) {
        size = size1;
        age = age1;
        color = color1;
    }
    public String getColor() {
        return color;
    }
}

