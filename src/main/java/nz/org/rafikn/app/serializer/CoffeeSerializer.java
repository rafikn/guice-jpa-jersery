package nz.org.rafikn.app.serializer;

import nz.org.rafikn.app.dto.CoffeeDto;
import nz.org.rafikn.app.model.Coffee;

/**
 * Created by rafik on 25/09/16.
 */
public class CoffeeSerializer {

    public Coffee deserialize(CoffeeDto dto) {
        return new Coffee();
    }

    public CoffeeDto serialize(Coffee coffee) {
        return new CoffeeDto();
    }
}
