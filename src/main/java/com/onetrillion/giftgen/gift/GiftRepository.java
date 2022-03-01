package com.onetrillion.giftgen.gift;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GiftRepository extends MongoRepository<Gift, String> {
    List<Gift> findGiftsByCategory(Category category);

}
