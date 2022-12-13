package inventory.product;


import inventory.category.Category;
import inventory.item.Item;
import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue (strategy=GenerationType.UUID)
    @Column
    private UUID id;

    @ManyToOne
    @JoinColumn
    private Category category;

    @Column
    private String name;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Item> items;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
