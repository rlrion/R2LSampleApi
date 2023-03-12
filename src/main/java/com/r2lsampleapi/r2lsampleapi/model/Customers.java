package com.r2lsampleapi.r2lsampleapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customers {

    @Id
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "reg")
    private String reg;

}
