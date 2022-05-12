package com.example.ex15jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address", schema = "public")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @Column(name = "id") 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private  long id; 

    @Column(name = "text")
    private String addressText;

    @Column(name = "zip")
    private String zipCode;
}
