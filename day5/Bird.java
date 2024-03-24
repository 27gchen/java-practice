package day5;
public class Bird extends Animal{
    public Bird(int h, int w, String n) {
        super(h, w, n);
    }

    public void fly() {
        System.out.println(name + " is flying");
    }

    public int getHeight() {
        return height + 1;
    }

    public static void main(String[] args) {
        Bird b = new Bird(5, 3, "john");
        b.fly();
        int h = b.getHeight();
        System.out.println("bird has height: " + h);
    }
}
