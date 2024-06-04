package com.udea.arqui.parcial.rest.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {

    @Id
    private Long id;

    private String name;

    private String department;

    private String country;

    @OneToOne
    @JoinColumn(name = "WEATHER_ID")
    private Weather weather;

}
