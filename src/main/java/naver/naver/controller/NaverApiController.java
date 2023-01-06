package naver.naver.controller;

import lombok.RequiredArgsConstructor;
import naver.naver.restaurant.WishListDto;
import naver.naver.restaurant.WishListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/food")
@RequiredArgsConstructor
public class NaverApiController {

    private final WishListService wishListService;

    @GetMapping("/search")
    public WishListDto search(@RequestParam String query) {
        return wishListService.search(query);
    }

    @PostMapping("")
    public void add(@RequestBody WishListDto wishListDto) {
        wishListService.add(wishListDto);
    }

    @GetMapping("/all")
    public List<WishListDto> findALl() {
        return wishListService.findALl();
    }

    @DeleteMapping("/{index}")
    public void delete(@PathVariable int index) {
        wishListService.delete(index);
    }

    @PostMapping("/{index}")
    public void addVisit(@PathVariable int index) {
        wishListService.addVisit(index);
    }

}
