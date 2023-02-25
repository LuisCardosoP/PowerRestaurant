package com.powerup.square.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data

@NonNull
public class Plate {
    private Long id;
    private String name;
    private String idCategory;
    private String description;
    private String price;
//    private String idRestaurant;
    private String urlImage;

    public Plate(Long id, String name, String idCategory, String description, String price, String urlImage) {
        this.id = id;
        this.name = name;
        this.idCategory = idCategory;
        this.description = description;
        this.price = price;
        this.urlImage = urlImage;
    }
}
