package id.go.bandung.salary.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.GolonganDao;
import id.go.bandung.salary.manager.GolonganManager;
import id.go.bandung.salary.model.Golongan;

@Service
public class GolonganManagerImpl implements GolonganManager {

	@Autowired
	GolonganDao golonganDao;

	public List<Golongan> getAll() {
		return golonganDao.getAll();
	}

	public void add(Golongan t) {
		golonganDao.add(t);
	}

	public void edit(Golongan t) {
		golonganDao.edit(t);
	}

	public Golongan find(Integer id) {
		return golonganDao.find(id);
	}

	public void delete(Integer id) {
		golonganDao.delete(id);
	}

}
