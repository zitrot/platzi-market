package com.platzimarket.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "CLIENTES")
public class Customer {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "apellidos")
    private String lastName;

    @Column(name = "celular")
    private Long phone;

    @Column(name = "correo_electronico")
    private String email;

    @Column(name = "direccion")
    private String address;

    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "customer")
    private List<Purchase> purchases;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
