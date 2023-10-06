package ru.negrya.dao;

import ru.negrya.entity.Car;

public interface CarDAO {

    public void create(Car car);

    public Car read(int id);

    public void update(Car car);

    public void delete(Car car);
}
