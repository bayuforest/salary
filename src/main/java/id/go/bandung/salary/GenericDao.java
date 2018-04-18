package id.go.bandung.salary;

import java.util.List;

public interface GenericDao<T> {
	public List<T> getAll();

	public void add(T t);

	public void edit(T t);

	public T find(Integer id);

	public void delete(Integer id);
}
