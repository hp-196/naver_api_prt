package naver.CRUD_PRT.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserRequest {

    private String name;
    private String email;
    private int age;
}
