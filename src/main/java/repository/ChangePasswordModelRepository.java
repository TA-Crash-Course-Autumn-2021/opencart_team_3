package repository;

import datamodel.ChangePasswordModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ChangePasswordModelRepository {

    private ChangePasswordModelRepository() {
    }

    public static ChangePasswordModel getChangePasswordModel() {
        String password = RandomStringUtils.randomAlphabetic(6);
        return ChangePasswordModel.getBuilder()
                .password(password)
                .passwordConfirm(password)
                .build();
    }

}
