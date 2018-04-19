package id.go.bandung.salary.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.go.bandung.salary.dao.TransPotonganDao;
import id.go.bandung.salary.model.Potongan;
import id.go.bandung.salary.model.TransPotongan;

@Repository
public class TransPotonganDaoImpl implements TransPotonganDao {

	@Autowired
	DataSource dataSource;

	/**
	 * Not implemented
	 */
	public List<TransPotongan> getAll() {
		return null;
	}

	public void add(TransPotongan t) {
		String sql = "insert into t_potongan (thn, bln, peg_nip, pot_id, pot_value) "
				+ "values (?,?,?,?,?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getTahun());
			ps.setInt(2, t.getBulan());
			ps.setString(3, t.getNip());
			ps.setInt(4, t.getPotongan().getPotId());
			ps.setInt(5, t.getPotValue());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit(TransPotongan t) {
		String sql = "update t_potongan set pot_value ? where thn = ? and bln = ? and peg_nip = ? and pot_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getPotValue());
			ps.setInt(2, t.getTahun());
			ps.setInt(3, t.getBulan());
			ps.setString(4, t.getNip());
			ps.setInt(5, t.getPotongan().getPotId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Not implemented
	 */
	public TransPotongan find(Integer id) {
		return null;
	}
	
	public TransPotongan findTransPotongan(Integer tahun, Integer bulan, String nip, Potongan potongan){
		String sql = "select * from t_potongan where thn = ?, bln = ?, nip = ? and pot_id = ?";
		TransPotongan tp = null;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, tahun);
			ps.setInt(2, bulan);
			ps.setString(3, nip);
			ps.setInt(4, potongan.getPotId());
			ResultSet rs = ps.executeQuery();
			if (rs.next()){
				tp = new TransPotongan();
				tp.setTahun(tahun);
				tp.setBulan(bulan);
				tp.setNip(nip);
				tp.setPotongan(potongan);
				tp.setPotValue(rs.getInt("pot_value"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tp;
	}

	/**
	 * Not implemented
	 */
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	}

}
