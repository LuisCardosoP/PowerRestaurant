package com.powerup.square.infraestructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "plates")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlateEntity {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "id_category", nullable = false)
    private String idCategory;

    @Column(name = "price", nullable = false)
    private Long price;
//    @ManyToOne
//    @JoinColumn(name = "id_Restaurant", nullable = false)
//    private RestaurantEntity restaurant;

    @Column(name = "urlImage", nullable = false, length = 60)
    private String urlImage;


}
