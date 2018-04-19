package id.go.bandung.salary.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.TransPotonganDao;
import id.go.bandung.salary.manager.TransPotonganManager;
import id.go.bandung.salary.model.Potongan;
import id.go.bandung.salary.model.TransPotongan;

@Service
public class TransPotonganManagerImpl implements TransPotonganManager {

	@Autowired
	TransPotonganDao transPotonganDao;

	public List<TransPotongan> getAll() {
		return transPotonganDao.getAll();
	}

	public void add(TransPotongan t) {
		transPotonganDao.add(t);
	}

	public void edit(TransPotongan t) {
		transPotonganDao.edit(t);
	}

	public TransPotongan findTransPotongan(Integer tahun, Integer bulan,
			String nip, Potongan potongan) {
		return transPotonganDao.findTransPotongan(tahun, bulan, nip, potongan);
	}

}
