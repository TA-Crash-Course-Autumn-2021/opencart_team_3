package repository;

import datamodel.CheckoutModel;
import datamodel.CouponeModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CouponeModelRepository {
    public static CouponeModel getCuponeModel(){
        return CouponeModel.getBuilder()
                .couponeName(RandomStringUtils.randomAlphabetic(5)+"coupon")
                .couponeCode(RandomStringUtils.randomNumeric(4))
                .discount(RandomStringUtils.randomNumeric(2))
                .totalAmount(RandomStringUtils.randomNumeric(2))
                .build();
    }

    public static  String getValidCouponModel(){return "0000";}

}