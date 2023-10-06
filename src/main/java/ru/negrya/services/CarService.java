package ru.negrya.services;

import com.sun.istack.NotNull;
import ru.negrya.dao.CarDAO;
import ru.negrya.dao.CarDAOImpl;
import ru.negrya.entity.Car;

public class CarService {

    private CarDAO carDAO = new CarDAOImpl();

    public void create(@NotNull final Car car) {
        carDAO.create(car);
    }

    public Car read(final int id) {
        return carDAO.read(id);
    }

    public void update(@NotNull final Car car) {
        carDAO.update(car);
    }

    public void delete(@NotNull final Car car) {
        carDAO.delete(car);
    }
}
