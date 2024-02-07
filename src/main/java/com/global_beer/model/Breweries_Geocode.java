package com.global_beer.model;

import java.io.Serializable;
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
public class Breweries_Geocode implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;

   private long brewery_id;
   private Double latitude;
   private Double longitude;

}
