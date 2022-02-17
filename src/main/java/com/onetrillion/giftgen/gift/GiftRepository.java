package com.onetrillion.giftgen.gift;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GiftRepository extends MongoRepository<Gift, String> {
}
