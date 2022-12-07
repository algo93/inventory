package com.myshop.inventory;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "item")
public class Item {

    @Id
    //@GenericGenerator(strategy=GenarationType.UUID)
    @GeneratedValue (strategy=GenerationType.UUID)
    private UUID id;


    @Column
    private String price;

    @ManyToOne
    @JoinColumn
    private Product product;

    @Column(name = "mfg_date")
    private Date mfgDate;

    @Column(name = "exp_date")
    private Date expDate;

    @Column(name = "batch_number")
    private int batchNumber;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }
}
