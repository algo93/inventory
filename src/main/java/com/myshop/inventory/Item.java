package com.myshop.inventory;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GenericGenerator(name = "stringIdGenerator" , strategy = "IdGenerator")
    @GeneratedValue()
    @Column(name = "item_id" , nullable = false , updatable = false)
    private String itemId;

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

    @ManyToOne
    @JoinColumn(name = "product_id" , nullable = false)
    private String productId;



}
