package com.onetrillion.giftgen;

import com.onetrillion.giftgen.gift.Category;
import com.onetrillion.giftgen.gift.Gift;
import com.onetrillion.giftgen.gift.GiftRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GiftGenApplication {

    public static void main(String[] args) {
        SpringApplication.run(GiftGenApplication.class, args);
    }
    /*
    @Bean
    CommandLineRunner runner(GiftRepository repository){
        return args -> {
            Gift gift = new Gift(
                    "Toothbrush",
                    "200",
                    Category.FRIEND,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift2 = new Gift(
                    "Phone",
                    "33200",
                    Category.PARTNER,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift3 = new Gift(
                    "Grape",
                    "2",
                    Category.FRIEND,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift4 = new Gift(
                    "Keyboard",
                    "2070",
                    Category.PARENT,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift5 = new Gift(
                    "Paper",
                    "99",
                    Category.PARENT,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift6 = new Gift(
                    "Ring",
                    "90000",
                    Category.PARTNER,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift7 = new Gift(
                    "Book",
                    "199",
                    Category.FRIEND,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            Gift gift8 = new Gift(
                    "Mouse",
                    "499",
                    Category.PARENT,
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor leo a diam sollicitudin tempor id eu nisl nunc. Cursus vitae congue mauris rhoncus.",
                    "https://loremipsum.io/generator/?n=1&t=p"
            );
            repository.insert(gift);
            repository.insert(gift2);
            repository.insert(gift3);
            repository.insert(gift4);
            repository.insert(gift5);
            repository.insert(gift6);
            repository.insert(gift7);
            repository.insert(gift8);

            repository.findStudentByEmail(email)
                    .ifPresentOrElse(s -> {
                        System.out.println(s + " already exists");

                    }, () -> {
                        System.out.println("inserting student " + student);
                        repository.insert(student);
                    });




        };

    }*/
}
