package com.onetrillion.giftgen.gift;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Gift {
    @Id
    private String id;
    private String name;
    private String price;

    public Gift(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
