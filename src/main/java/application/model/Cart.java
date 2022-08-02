package application.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cartId")
    private Integer id;

    @Column(name="name")
    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "cart")
    private Set<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer cartId) {
        this.id = cartId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
