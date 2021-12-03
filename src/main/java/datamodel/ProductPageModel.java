package datamodel;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
public class ProductPageModel {

    private int select; // 15 or 16
    private int size; // 13 or 14
    private final LocalDate deliveryDate;
    private String quantity;

}
