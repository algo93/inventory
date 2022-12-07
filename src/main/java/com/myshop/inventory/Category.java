package com.myshop.inventory;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GenericGenerator(name="x" ,strategy="IdGenerator")
    @GeneratedValue (generator="x")
    @Column(nullable=false, updatable=false)
    private String categoryId;

    @Column
    @Basic
    private String name;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}