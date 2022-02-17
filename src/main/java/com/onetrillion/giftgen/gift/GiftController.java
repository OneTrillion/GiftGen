package com.onetrillion.giftgen.gift;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/Gifts")
@AllArgsConstructor
public class GiftController {
    private final GiftService giftService;

    @GetMapping
    public List<Gift> fetchAllGifts() {return giftService.getAllGifts();}
}
