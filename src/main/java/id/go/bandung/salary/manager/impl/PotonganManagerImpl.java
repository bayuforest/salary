package id.go.bandung.salary.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.PotonganDao;
import id.go.bandung.salary.manager.PotonganManager;
import id.go.bandung.salary.model.Potongan;

@Service
public class PotonganManagerImpl implements PotonganManager {

	@Autowired
	PotonganDao potonganDao;

	public List<Potongan> getAll() {
		return potonganDao.getAll();
	}

	public void add(Potongan t) {
		potonganDao.add(t);
	}

	public void edit(Potongan t) {
		potonganDao.edit(t);
	}

	public Potongan find(Integer id) {
		return potonganDao.find(id);
	}

	public void delete(Integer id) {
		potonganDao.delete(id);
	}

}
