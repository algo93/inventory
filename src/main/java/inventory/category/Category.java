package inventory.category;

import inventory.product.Product;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue (strategy=GenerationType.UUID)
    @Column
    private UUID id;

    @Column(unique = true)
    @Basic
    @JoinColumn
    private String name;

    @OneToMany(mappedBy = "category" , cascade = ALL)
    private List<Product> products;

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

    public List<Product> getProduct() {
        return products;
    }

    public void setProduct(List<Product> products) {
        this.products = products;
    }
}