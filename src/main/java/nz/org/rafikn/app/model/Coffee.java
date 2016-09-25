package nz.org.rafikn.app.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by rafik on 24/09/16.
 */
@Entity
@Table(name = "coffee")
public class Coffee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String name;

    @NotNull
    private double price;

    private Date creationDate;

    @ManyToOne
    private Country country;

    @ManyToMany(mappedBy = "coffees")
    private Set<Supplier> suppliers;

    @OneToOne
    private CoffeeFlavour flavour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }

    public CoffeeFlavour getFlavor() {
        return flavour;
    }

    public void setFlavor(CoffeeFlavour flavor) {
        this.flavour = flavor;
    }
}
