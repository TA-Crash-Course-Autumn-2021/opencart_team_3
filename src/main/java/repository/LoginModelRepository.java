package repository;

import datamodel.LoginModel;
import org.apache.commons.lang3.RandomStringUtils;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    public static LoginModel getLoginModel() {
        String password = RandomStringUtils.randomAlphabetic(7);
        return LoginModel.getBuilder()
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .password(password)
                .build();
    }
}