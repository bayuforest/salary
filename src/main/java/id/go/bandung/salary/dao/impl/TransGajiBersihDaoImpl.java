package id.go.bandung.salary.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import id.go.bandung.salary.dao.TransGajiBersihDao;
import id.go.bandung.salary.model.TransGajiBersih;

@Repository
public class TransGajiBersihDaoImpl implements TransGajiBersihDao {

	@Autowired
	DataSource dataSource;

	/**
	 * Not implemented
	 */
	public List<TransGajiBersih> getAll() {
		return null;
	}

	public void add(TransGajiBersih t) {
		String sql = "insert into t_gaji_bersih (thn, bln, peg_nip, peg_gapok, peg_gaber) values "
				+ "(?,?,?,?,?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getTahun());
			ps.setInt(2, t.getBulan());
			ps.setString(3, t.getNip());
			ps.setInt(4, t.getGapok());
			ps.setInt(5, t.getGaber());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit(TransGajiBersih t) {
		String sql = "update t_gaji_bersih set peg_gapok = ?, peg_gaber = ? where "
				+ "thn = ? and bln = ? and peg_nip = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getGapok());
			ps.setInt(2, t.getGaber());
			ps.setInt(3, t.getTahun());
			ps.setInt(4, t.getBulan());
			ps.setString(5, t.getNip());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public TransGajiBersih find(Integer tahun, Integer bulan, String nip) {
		String sql = "select * from t_gaji_bersih where tahun = ? and bulan = ? and peg_nip = ?";
		TransGajiBersih tgb = null;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, tahun);
			ps.setInt(2, bulan);
			ps.setString(3, nip);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				tgb = new TransGajiBersih();
				tgb.setTahun(tahun);
				tgb.setBulan(bulan);
				tgb.setNip(nip);
				tgb.setGapok(rs.getInt("peg_gapok"));
				tgb.setGaber(rs.getInt("peg_gaber"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tgb;
	}

}
