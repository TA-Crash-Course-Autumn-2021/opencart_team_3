package repository;

import models.LoginUserModel;
import models.RegisterUserModel;
import org.apache.commons.lang.RandomStringUtils;

public class LoginUserModelRepository {

    private LoginUserModelRepository(){

    }

    public static LoginUserModel getValidLoginUser(){
        String password = RandomStringUtils.randomNumeric(12);
        return LoginUserModel.builder()
                .setEmailLogin("dan@gmail.com")
                .setPasswordLogin("1111")
                .build();
    }

}
