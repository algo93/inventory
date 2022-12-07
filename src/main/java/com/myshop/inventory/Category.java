package com.myshop.inventory;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue (strategy=GenerationType.UUID)
    @Column
    private UUID id;

    @Column
    @Basic
    @JoinColumn
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}