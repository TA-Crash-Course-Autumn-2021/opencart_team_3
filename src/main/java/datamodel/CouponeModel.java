package datamodel;

import lombok.Getter;

@Getter
public class CouponeModel {
    private String couponeName;
    private String couponeCode;
    private String discount;
    private String totalAmount;
    //private String usesPerCoupone;
    //private String usesPerCustomer;


    public CouponeModel(){}
    public static CouponeModel.Builder getBuilder() {
        return new CouponeModel().new Builder();
    }

    public class Builder {
        public CouponeModel.Builder couponeName(String value) {
            couponeName = value;
            return this;
        }
        public CouponeModel.Builder couponeCode(String value) {
            couponeCode = value;
            return this;
        }
        public CouponeModel.Builder discount(String value) {
            discount = value;
            return this;
        }
        public CouponeModel.Builder totalAmount(String value) {
            totalAmount = value;
            return this;
        }

        public CouponeModel build() {
            return CouponeModel.this;
        }
    }
}
