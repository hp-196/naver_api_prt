package naver.CRUD_PRT.controller;

import naver.CRUD_PRT.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class GetApiController {


    @GetMapping("/pathVariable/{name}")
    public String pathVariable(@PathVariable String name) {
        System.out.println("PathVariable : "+name);
        return name;
    }

    @GetMapping("/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            sb.append(entry.getKey()+" = "+entry.getValue()).append('\n');
        });
        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam2(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age) {

        return name+" "+email+" "+age;
    }

    @GetMapping("query-param03")
    public String queryParam3(UserRequest userRequest) {
        return userRequest.toString();
    }

}
