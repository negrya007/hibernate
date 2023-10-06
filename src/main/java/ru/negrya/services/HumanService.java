package ru.negrya.services;

import com.sun.istack.NotNull;
import ru.negrya.dao.HumanDAO;
import ru.negrya.dao.HumanDAOImpl;
import ru.negrya.entity.Human;

public class HumanService {

    private HumanDAO humanDAO = new HumanDAOImpl();

    public void create(@NotNull final Human human) {
        humanDAO.create(human);
    }

    public Human read(final int id) {
      return humanDAO.read(id);
    }

    public void update(@NotNull final Human human) {
        humanDAO.update(human);
    }

    public void delete(@NotNull final Human human) {
        humanDAO.delete(human);
    }
}
