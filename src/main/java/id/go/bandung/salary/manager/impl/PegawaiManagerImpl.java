package id.go.bandung.salary.manager.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.PegawaiDao;
import id.go.bandung.salary.manager.PegawaiManager;
import id.go.bandung.salary.model.Pegawai;

@Service
public class PegawaiManagerImpl implements PegawaiManager {

	@Autowired
	PegawaiDao pegawaiDao;

	public List<Pegawai> getAll() {
		return pegawaiDao.getAll();
	}

	public void add(Pegawai t) {
		pegawaiDao.add(t);
	}

	public void edit(Pegawai t) {
		pegawaiDao.edit(t);
	}

	public Pegawai find(String nip) {
		return pegawaiDao.find(nip);
	}

	public void delete(String nip) {
		pegawaiDao.delete(nip);
	}

}
