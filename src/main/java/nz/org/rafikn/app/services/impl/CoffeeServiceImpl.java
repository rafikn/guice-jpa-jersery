package nz.org.rafikn.app.services.impl;

import nz.org.rafikn.app.dao.CoffeeDao;
import nz.org.rafikn.app.dto.CoffeeDto;
import nz.org.rafikn.app.serializer.CoffeeSerializer;
import nz.org.rafikn.app.services.CoffeeService;

import javax.inject.Inject;

/**
 * Created by rafik on 24/09/16.
 */
public class CoffeeServiceImpl implements CoffeeService {

    private final CoffeeDao coffeeDao;
    private final CoffeeSerializer coffeeSerializer;

    @Inject
    public CoffeeServiceImpl(CoffeeDao coffeeDao, CoffeeSerializer coffeeSerializer) {
        this.coffeeDao = coffeeDao;
        this.coffeeSerializer = coffeeSerializer;
    }

    @Override
    public CoffeeDto getCoffeeByName(String name) {
        return new CoffeeDto();
    }

    @Override
    public CoffeeDto getCoffeeById(int id) {
        return coffeeSerializer.serialize(coffeeDao.get(id));
    }
}
