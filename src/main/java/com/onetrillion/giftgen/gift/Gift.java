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
    private Category category;
    private String description;
    private String buyLink;

    public Gift(String name, String price, Category category, String description, String buyLink) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.buyLink = buyLink;
    }
}
