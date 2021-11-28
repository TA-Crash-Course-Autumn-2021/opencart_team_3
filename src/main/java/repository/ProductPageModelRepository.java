package repository;

import datamodel.AppleCinemaModel;
import datamodel.ProductPageModel;

public class ProductPageModelRepository {

    private ProductPageModelRepository(){}

    public static ProductPageModel orderUsualProductModel(){
        return ProductPageModel.builder()
                .quantity("2")
                .build();
    }

    public static ProductPageModel orderProductWithSelectFieldModel(){
        return ProductPageModel.builder()
                .select(16)
                .quantity("2")
                .build();
    }

    public static ProductPageModel orderProductWithSizeFieldModel() {
        return ProductPageModel.builder()
                .size(13)
                .quantity("1")
                .build();
    }

    public static ProductPageModel orderProductWithDeliveryDateFieldModel() {
        return ProductPageModel.builder()
                .deliveryDate("2022-01-01")
                .quantity("3")
                .build();
    }
}
