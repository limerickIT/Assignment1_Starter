package com.global_beer.model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Beer implements Serializable {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;

 private long brewery_id;
 private String name;
 private Integer cat_id;
 private Integer style_id;
 private Double abv;
 private Double ibu;
 private Double srm;

 @Lob
 private String description;
 private Integer add_user;

 @Temporal(TemporalType.TIMESTAMP)
 private Date last_mod;

 private String image;
 private Double buy_price;
 private Double sell_price;

}
