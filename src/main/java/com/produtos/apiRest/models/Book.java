package com.produtos.apiRest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_BOOKS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Book implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long userId;
    private String title;
    private String autor;
    private BigDecimal pages;

    public static long getSerialversionuid() {
        return SerialVersionUID;
    }

}
