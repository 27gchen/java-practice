package day5;
public class Bird extends Animal{
    public void fly() {
        System.out.println(name + " is flying");
    }

    public int getHeight() {
        return height + 1;
    }

    public static void main(String[] args) {
    }
}
