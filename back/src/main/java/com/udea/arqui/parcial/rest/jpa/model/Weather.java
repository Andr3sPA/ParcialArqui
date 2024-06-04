package com.udea.arqui.parcial.rest.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonIgnore
    private Long id;

    @Schema(description = "temperature in celsius", example = "28.2")
    private Float temperature;
    
    @Schema(description = "humidity in percentage", example = "31.33")
    private Float humidity;
    
    @Schema(description = "probability of precipitation", example = "19.9")
    private Float precipitation;

}
