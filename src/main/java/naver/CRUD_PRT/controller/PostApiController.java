package naver.CRUD_PRT.controller;

import naver.CRUD_PRT.dto.PostRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post01")
    public void post01(@RequestBody Map<String, Object> requestData) {
        for (Map.Entry<String, Object> stringObjectEntry : requestData.entrySet()) {
            System.out.println("key "+stringObjectEntry.getKey());
            System.out.println("value "+stringObjectEntry.getValue());
        }
    }

    @PostMapping("/post02")
    public void post02(@RequestBody PostRequestDto postRequestDto) {
        System.out.println(postRequestDto);
    }
}
