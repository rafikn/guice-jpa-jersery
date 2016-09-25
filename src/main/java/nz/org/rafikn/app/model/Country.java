package nz.org.rafikn.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by rafik on 24/09/16.
 */
@Entity
@Table(name = "country")
public class Country  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToMany
    private Set<Coffee> coffees;

    @OneToMany
    private Set<Supplier> suppliers;

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

    public Set<Coffee> getCoffees() {
        return coffees;
    }

    public void setCoffees(Set<Coffee> coffees) {
        this.coffees = coffees;
    }

    public Set<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}
