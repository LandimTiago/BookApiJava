package com.produtos.apiRest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_BOOKS")
public class Book implements Serializable {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String title;
    @NotNull
    private String autor;
    @NotNull
    private BigDecimal pages;

    public long getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public BigDecimal getPages() {
        return pages;
    }

    public String getTitle() {
        return title;
    }

    public static long getSerialversionuid() {
        return SerialVersionUID;
    }

}
