package Gunler.gun1;

import com.github.javafaker.Faker;

public class Test1 {
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println("faker.animal().name() = " + faker.animal().name());
        System.out.println("faker.artist().name() = " + faker.artist().name());
        System.out.println("faker.country().capital() = " + faker.country().capital());
        for (int i = 0; i <30 ; i++) {
            System.out.println("faker.country().capital() = " + faker.country().capital());


        }

    }
}
