package repository;

import datamodel.LoginModel;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {

    private LoginModelRepository() {
    }


    public static LoginModel getInvalidLoginModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return LoginModel.getBuilder()
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .password(password)
                .build();
    }


    public static LoginModel getValidLoginModel() {
        return LoginModel.getBuilder()
                .email("test@test.com")
                .password("12345678")
                .build();
    }

    public static LoginModel getUserOne() {
        return LoginModel.getBuilder().
                email("test@test.com")
                .password("12345678")
                .build();
    }
}