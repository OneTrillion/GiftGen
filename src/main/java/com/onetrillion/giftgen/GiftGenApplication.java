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
                    Category.FRIEND
            );
            Gift gift2 = new Gift(
                    "Phone",
                    "5000",
                    Category.PARENT
            );

            repository.insert(gift);
            repository.insert(gift2);


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
