package com.onetrillion.giftgen.gift;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/Gifts")
@AllArgsConstructor
public class GiftController {
    private final GiftService giftService;

    @GetMapping("/featured")
    public List<Gift> fetchAllGifts() {
        return giftService.getAllGifts()
                .stream().limit(10L)
                .collect(Collectors.toList());}

    @GetMapping("/parent")
    public List<Gift> fetchParentsGifts() {return giftService.getParentsGifts();}

    @GetMapping("/friend")
    public List<Gift> fetchFriendsGifts() {return giftService.getFriendsGifts();}

    @GetMapping("/partner")
    public List<Gift> fetchPartnersGifts() {return giftService.getPartnersGifts();}

}
