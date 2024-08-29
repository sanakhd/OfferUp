package com.offerup.CatalogueService.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Document("items")
public class Item {

    @Id
    private ObjectId id;
    private String itemName;
    private String description;
    private List<Shipping> shippingOptions = new ArrayList<>();


}
