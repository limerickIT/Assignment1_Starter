package com.global_beer.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Alan.Ryan
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Brewery implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String code;
    private String country;
    private String phone;
    private String website;
    private String image;

    @Lob
    private String description;

    private Integer add_user;

    @Temporal(TemporalType.TIMESTAMP)
    private Date last_mod;

    private Double credit_limit;
    private String email;

}

