package naver.CRUD_PRT.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;

@Getter
@Setter
@ToString
public class UserDto {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    @Email
    private String email;
}
