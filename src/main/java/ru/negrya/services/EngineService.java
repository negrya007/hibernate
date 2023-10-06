package ru.negrya.services;

import com.sun.istack.NotNull;
import ru.negrya.dao.EngineDAO;
import ru.negrya.dao.EngineDAOImpl;
import ru.negrya.entity.Engine;

public class EngineService {

    private EngineDAO engineDAO = new EngineDAOImpl();

    public void create(@NotNull final Engine engine) {
        engineDAO.create(engine);
    }

    public Engine read(@NotNull final String model) {
       return engineDAO.read(model);
    }

    public void update(@NotNull final Engine engine) {
        engineDAO.update(engine);
    }

    public void delete(@NotNull final Engine engine) {
        engineDAO.delete(engine);
    }
}
