package day1;
public class Person {
    private int height;
    private int age;
    public String name;
    private String favoriteColor;
    public Person() {
        height = 200;
        age = 14;
        name = "Kevin";
        favoriteColor = "green";
    }

    public Person(String personName) {
        height = 200;
        age = 14;
        name = personName;
        favoriteColor = "green";
    }

    public Person(String personName, String favColor) {
        height = 200;
        age = 14;
        name = personName;
        favoriteColor = favColor;
    }

    public void run(){
        System.out.println(name + " is running!");
    }
    
    public int getAge(){
        return age;
    }
    public String getColor(){
        return favoriteColor;
    }
}