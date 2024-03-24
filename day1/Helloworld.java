package day1;
/**
 * helloworld
 */
public class Helloworld {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Michael");
        String name = person1.name;
        person1.run();
        person2.run();
        int person1Age = person1.getAge();
        int yearsAwaysFrom18 = 18 - person1Age;
        System.out.println("person1 is " + yearsAwaysFrom18 + " years away from 18 years old!");
        System.out.println("person2's favorite color is " + person2.getColor());
    }

}