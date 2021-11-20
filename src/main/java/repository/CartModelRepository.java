package repository;
import datamodel.CartModel;
import org.apache.commons.lang3.RandomStringUtils;


public class CartModelRepository {
    public static CartModel getCartModel() {
        return CartModel.getBuilder()
                .PostCode(RandomStringUtils.randomNumeric(5))
                .giftCertificate(RandomStringUtils.randomAlphabetic(5))
                .Quantity(RandomStringUtils.randomNumeric(2))
                .Coupon(RandomStringUtils.randomAlphabetic(5))
                .build();
    }
}