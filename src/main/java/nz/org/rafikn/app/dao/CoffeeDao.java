package nz.org.rafikn.app.dao;


import nz.org.rafikn.app.model.Coffee;

/**
 * Created by rafik on 25/09/16.
 */
public interface CoffeeDao {

    Coffee get(Object id);

    void add(Coffee coffee);
}
