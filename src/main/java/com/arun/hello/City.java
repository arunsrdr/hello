package com.arun.hello;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@Entity
//@Table(name = "City")
//@EntityListeners(AuditingEntityListener.class)\
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
//public class City implements Serializable {
public class City implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String countryCode;
    @NotBlank
    private String district;
}