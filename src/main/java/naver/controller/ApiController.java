package naver.controller;

import naver.dto.UserDto;
import org.apache.catalina.User;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String hello() {
        return "HELLO SPRING";
    }


    @PostMapping("/json")
    public UserDto json(@RequestBody UserDto userDto) {
        return userDto;
    }

    @PutMapping("/put")
    public ResponseEntity<UserDto> put(@RequestBody UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @PostMapping("/user")
    public ResponseEntity<UserDto> user(@Valid @RequestBody UserDto userDto, BindingResult result) {
        if (result.hasErrors()) {
            StringBuilder sb = new StringBuilder();
            result.getAllErrors().forEach(objectError -> {
                FieldError fieldError = (FieldError) objectError;
                String message = objectError.getDefaultMessage();

                System.out.println("field :"+fieldError);
                System.out.println(message);
            });
        }

        return ResponseEntity.ok(userDto);
    }



}
