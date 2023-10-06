package ru.negrya.dao;

import ru.negrya.entity.Engine;

public interface EngineDAO {

    public void create(Engine engine);

    public Engine read(String model);

    public void update(Engine engine);

    public void delete(Engine engine);
}
