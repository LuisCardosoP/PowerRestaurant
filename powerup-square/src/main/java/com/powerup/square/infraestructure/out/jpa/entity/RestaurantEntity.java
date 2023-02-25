package com.powerup.square.infraestructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "restaurants")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestaurantEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 60)
    private String name;

    @Column(name = "address", nullable = false, length = 60)
    private String address;
    @Column(name = "id_owner", nullable = false, length = 60)
    private String idOwner;

    @Column(name = "phone", nullable = false, length = 60)
    private String phone;

    @Column(name = "url_logo", nullable = false, length = 60)
    private String urlLogo;

    @Column(name = "nit", nullable = false, length = 60)
    private String nit;


//    @OneToMany(mappedBy = "restaurants")
//    private List<PlateEntity> plates;

}
