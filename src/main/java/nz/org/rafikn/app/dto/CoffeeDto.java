package nz.org.rafikn.app.dto;

import nz.org.rafikn.app.model.Country;

import java.util.Set;

/**
 * Created by rafik on 25/09/16.
 */
public class CoffeeDto {

    private int id;
    private String name;
    private double price;
    private String creationDate;
    private Country country;
    private Set<Integer> suppliers;
    private CoffeeFlavourDto flavour;

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

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Set<Integer> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Set<Integer> suppliers) {
        this.suppliers = suppliers;
    }

    public CoffeeFlavourDto getFlavour() {
        return flavour;
    }

    public void setFlavour(CoffeeFlavourDto flavour) {
        this.flavour = flavour;
    }
}
