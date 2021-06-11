package com.produtos.apiRest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_MEMBERS")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Users {

    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String firstName;
    private String lastName;
    private String cellPhone;
    private String address;
    private long addressNumber;
    private String city;

    public static long getSerialversionuid() {
        return SerialVersionUID;
    }
}
