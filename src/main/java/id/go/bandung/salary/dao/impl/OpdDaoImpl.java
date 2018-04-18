package id.go.bandung.salary.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.go.bandung.salary.dao.OpdDao;
import id.go.bandung.salary.model.Opd;

@Repository
public class OpdDaoImpl implements OpdDao {

	@Autowired
	DataSource dataSource;

	public Opd getOpd() {		
		String sql = "select nama_opd from m_opd fetch first row only";
		Opd opd = null;
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				String temp = rs.getString(1);
				opd = new Opd();
				opd.setNamaOpd(temp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return opd;
	}

}
