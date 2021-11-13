package repository;

import datamodel.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {

    public static EditAccountModel getEditAccountModel() {
        return EditAccountModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .build();
    }
}
