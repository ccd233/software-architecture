package daopattern;

import java.util.List;

public interface Dao<E> {
    public List<E> GetAllObject();
    public E GetObject(int index);
    public void DeleteObject(int index);
    public void AddObject(E object);
}
