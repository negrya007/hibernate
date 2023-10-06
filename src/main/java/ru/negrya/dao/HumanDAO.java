package ru.negrya.dao;

import ru.negrya.entity.Human;

public interface HumanDAO {

    public void create(Human human);

    public Human read(int id);

    public void update(Human human);

    public void delete(Human human);
}
