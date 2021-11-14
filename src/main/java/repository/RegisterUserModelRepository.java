package repository;

import models.RegisterUserModel;
import org.apache.commons.lang.RandomStringUtils;

public class RegisterUserModelRepository {

    private RegisterUserModelRepository(){

    }

    public static RegisterUserModel getValidRegisterUser(){
        String password = RandomStringUtils.randomNumeric(12);
        return RegisterUserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(7) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }

}
