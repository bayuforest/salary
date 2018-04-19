package id.go.bandung.salary.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.TransGajiBersihDao;
import id.go.bandung.salary.manager.TransGajiBersihManager;
import id.go.bandung.salary.model.TransGajiBersih;

@Service
public class TransGajiBersihManagerImpl implements TransGajiBersihManager {

	@Autowired
	TransGajiBersihDao transGajiBersihDao;
	
	public List<TransGajiBersih> getAll() {		
		return transGajiBersihDao.getAll();
	}

	public void add(TransGajiBersih t) {
		transGajiBersihDao.add(t);
	}

	public void edit(TransGajiBersih t) {
		transGajiBersihDao.edit(t);
	}

	public TransGajiBersih find(Integer tahun, Integer bulan, String nip) {
		return transGajiBersihDao.find(tahun, bulan, nip);
	}

}
