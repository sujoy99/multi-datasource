package com.starter.demo.database1.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(schema = "postgres")
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Tbl1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
}
