package com.myshop.inventory;


import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GenericGenerator(name = "stringIdGenerator", strategy = "IdGenerator")
    @GeneratedValue()
    @Column(name = "product_id", nullable = false, updatable = false)
    private String productId;

    @ManyToOne
    @JoinColumn
    private Category category;

    @Column
    private String name;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
