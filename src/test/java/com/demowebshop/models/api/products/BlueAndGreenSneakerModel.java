package com.demowebshop.models.api.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BlueAndGreenSneakerModel {
    private int product_attribute_28_7_10;
    private int product_attribute_28_1_11;
    @JsonProperty("addtocart_28.EnteredQuantity")
    private int addtocart_28_EnteredQuantity;
}
