package naver.CRUD_PRT.controller;

import naver.CRUD_PRT.dto.PutRequestDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/putt")
    public void put(@RequestBody PutRequestDto putRequestDto) {
        System.out.println(putRequestDto);
    }
}
