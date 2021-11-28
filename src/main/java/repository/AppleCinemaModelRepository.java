package repository;

import datamodel.AppleCinemaModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AppleCinemaModelRepository {

    private AppleCinemaModelRepository() {}

    public static AppleCinemaModel getAppleCinemaModel() {
        return AppleCinemaModel.builder()
                .radio(5)
                .checkbox(8)
                .text(RandomStringUtils.randomAlphabetic(4))
                .select(4)
                .textArea(RandomStringUtils.randomAlphabetic(8))
                .uploadFile("src/test/resources/FileForUploading.txt")
                .date("2022-01-01")
                .time("00:00")
                .dateAndTime("2022-01-01 00:00")
                .quantity("3")
                .build();
    }
}
