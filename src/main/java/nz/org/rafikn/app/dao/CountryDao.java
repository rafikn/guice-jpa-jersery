package nz.org.rafikn.app.dao;

import nz.org.rafikn.app.model.Country;

/**
 * Created by rafik on 25/09/16.
 */
public interface CountryDao {

    Country get(int id);

    void add(Country country);

}
