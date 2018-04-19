package id.go.bandung.salary.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.go.bandung.salary.dao.OpdDao;
import id.go.bandung.salary.manager.OpdManager;
import id.go.bandung.salary.model.Opd;

@Service
public class OpdManagerImpl implements OpdManager {

	@Autowired
	OpdDao opdDao;

	public Opd getOpd() {
		return opdDao.getOpd();
	}

}
