package com.global_beer.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
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
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String cat_name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date last_mod;

    @OneToMany(mappedBy = "cat_id")
    @ToString. Exclude
    private List<Beer> beers;

}
