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

import id.go.bandung.salary.dao.PotonganDao;
import id.go.bandung.salary.model.Potongan;

@Repository
public class PotonganDaoImpl implements PotonganDao {

	@Autowired
	DataSource dataSource;

	public List<Potongan> getAll() {
		String sql = "select pot_id, pot_name from m_potongan order by pot_id";
		List<Potongan> result = new ArrayList<Potongan>();
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			Potongan potongan = null;
			while (rs.next()) {
				potongan = new Potongan();
				potongan.setPotId(rs.getInt("pot_id"));
				potongan.setPotName(rs.getString("pot_name"));
				result.add(potongan);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void add(Potongan t) {
		String sql = "insert into m_potongan (pot_name) values (?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getPotName());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit(Potongan t) {
		String sql = "update m_potongan set pot_name = ? where pot_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getPotName());
			ps.setInt(2, t.getPotId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Potongan find(Integer id) {
		String sql = "select pot_name form m_potongan where pot_id = ?";
		Potongan potongan = null;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				potongan = new Potongan();
				potongan.setPotId(id);
				potongan.setPotName(rs.getString("pot_name"));				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return potongan;
	}

	public void delete(Integer id) {
		String sql = "delete from m_potongan where pot_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
