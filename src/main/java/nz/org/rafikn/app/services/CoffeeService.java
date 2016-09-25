package nz.org.rafikn.app.services;

import nz.org.rafikn.app.dto.CoffeeDto;

/**
 * Created by rafik on 24/09/16.
 */
public interface CoffeeService {

    CoffeeDto getCoffeeByName(String name);

    CoffeeDto getCoffeeById(int id);

}
