package com.udea.arqui.parcial.rest.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Weather {

    @Id
    private Long id;

    private Float temperature;

    private Float humidity;

    private Float precipitation;

}
