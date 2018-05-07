package pl.javastart.weekop.dao;

import java.io.Serializable;
import java.util.List;



public interface GenericDAO <T , PK extends Serializable> {
	
	T create (T newObject);
	T read (PK primaryKey);
	boolean update(T updateObject);
	List<T>getAll();
	boolean delete(Long key);

}
