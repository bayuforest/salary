package id.go.bandung.salary.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.go.bandung.salary.dao.GolonganDao;
import id.go.bandung.salary.model.Golongan;

@Repository
public class GolonganDaoImpl implements GolonganDao {
	
	@Autowired
	DataSource dataSource;

	public List<Golongan> getAll() {		
		String sql = "select gol_id, gol_nm, gol_pkt from m_gol order by gol_id";
		List<Golongan> result = new ArrayList<Golongan>();
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Golongan golongan = null;
			while (rs.next()){
				golongan = new Golongan();
				golongan.setGolId(rs.getInt("gol_id"));
				golongan.setGolName(rs.getString("gol_nm"));
				golongan.setGolPangkat(rs.getString("gol_pkt"));
				result.add(golongan);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void add(Golongan t) {
		// not implemented		
	}

	public void edit(Golongan t) {
		// not implemented		
	}

	public Golongan find(Integer id) {		
		String sql = "select gol_id, gol_nm, gol_pkt from m_gol where gol_id = ?";
		Golongan golongan = null;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				golongan = new Golongan();
				golongan.setGolId(rs.getInt("gol_id"));
				golongan.setGolName(rs.getString("gol_nm"));
				golongan.setGolPangkat(rs.getString("gol_pkt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return golongan;
	}

	public void delete(Integer id) {
		// not implemented
	}

}
