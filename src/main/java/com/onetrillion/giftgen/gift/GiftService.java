package com.onetrillion.giftgen.gift;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GiftService {
    private final GiftRepository giftRepository;

    public List<Gift> getAllGifts() {return  giftRepository.findAll();}

    public List<Gift> getParentsGifts() {return giftRepository.findGiftsByCategory(Category.PARENT);}

    public List<Gift> getPartnersGifts() {return giftRepository.findGiftsByCategory(Category.PARTNER);}

    public List<Gift> getFriendsGifts() {return giftRepository.findGiftsByCategory(Category.FRIEND);}
}
