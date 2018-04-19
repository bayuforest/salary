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

import id.go.bandung.salary.dao.PegawaiDao;
import id.go.bandung.salary.model.Golongan;
import id.go.bandung.salary.model.Pegawai;

@Repository
public class PegawaiDaoImpl implements PegawaiDao {

	@Autowired
	DataSource dataSource;

	public List<Pegawai> getAll() {
		String sql = "select T1.*, T2.gol_nm, T2.gol_pkt from"
				+ "(select * from m_pegawai) T1" + "join"
				+ "(select * from m_gol) T2" + "on T1.peg_gol_id = T2.gol_id";
		List<Pegawai> result = new ArrayList<Pegawai>();
		try {
			Pegawai pegawai = null;
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				pegawai = new Pegawai();
				pegawai.setNip(rs.getString("peg_nip"));
				pegawai.setGelarDepan(rs.getString("peg_gelar_depan"));
				pegawai.setNama(rs.getString("peg_nama"));
				pegawai.setGelarBelakang(rs.getString("peg_gelar_belakang"));
				pegawai.setNpwp(rs.getString("peg_npwp"));
				pegawai.setJabatan(rs.getString("peg_jabatan"));
				pegawai.setEmail(rs.getString("peg_email"));
				pegawai.setGapok(rs.getInt("peg_gapok"));
				Golongan golongan = new Golongan();
				golongan.setGolId(rs.getInt("peg_gol_id"));
				golongan.setGolName(rs.getString("gol_nm"));
				golongan.setGolPangkat(rs.getString("gol_pkt"));
				pegawai.setGolongan(golongan);
				pegawai.setIsActive(rs.getBoolean("peg_active"));
				result.add(pegawai);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void add(Pegawai t) {
		String sql = "insert into m_pegawai values (?,?,?,?,?,?,?,?,?,?)";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getNip());
			ps.setString(2, t.getGelarDepan());
			ps.setString(3, t.getNama());
			ps.setString(4, t.getGelarBelakang());
			ps.setString(5, t.getNpwp());
			ps.setString(6, t.getJabatan());
			ps.setString(7, t.getEmail());
			ps.setInt(8, t.getGapok());
			ps.setInt(9, t.getGolongan().getGolId());
			ps.setBoolean(10, true);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void edit(Pegawai t) {
		String sql = "update m_pegawai set peg_gelar depan = ?, peg_nama = ?, "
				+ "peg_gelar_belakang = ?, peg_npwp = ?, peg_jabatan = ?, peg_email = ?, "
				+ "peg_gapok = ?, peg_gol_id = ? where peg_nip = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getGelarDepan());
			ps.setString(2, t.getNama());
			ps.setString(3, t.getGelarBelakang());
			ps.setString(4, t.getNpwp());
			ps.setString(5, t.getJabatan());
			ps.setString(6, t.getEmail());
			ps.setInt(7, t.getGapok());
			ps.setInt(8, t.getGolongan().getGolId());
			ps.setString(9, t.getNip());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

	public Pegawai find(String nip) {
		String sql = "select T1.*, t2.gol_nm, T2.gol_pkt from "
				+ "(select * from m_pegawai where peg_nip = '198609042015031002') T1 "
				+ "join " + "(select * from m_gol) T2 "
				+ "on T1.peg_gol_id = T2.gol_id";
		Pegawai pegawai = null;
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nip);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				pegawai = new Pegawai();
				pegawai.setNip(nip);
				pegawai.setGelarDepan(rs.getString("peg_gelar_depan"));
				pegawai.setNama(rs.getString("peg_nama"));
				pegawai.setGelarBelakang(rs.getString("peg_gelar_belakang"));
				pegawai.setNpwp(rs.getString("peg_npwp"));
				pegawai.setJabatan(rs.getString("peg_jabatan"));
				pegawai.setEmail(rs.getString("peg_email"));
				pegawai.setGapok(rs.getInt("peg_gapok"));
				Golongan golongan = new Golongan();
				golongan.setGolId(rs.getInt("peg_gol_id"));
				golongan.setGolName(rs.getString("gol_nm"));
				golongan.setGolPangkat(rs.getString("gol_pkt"));
				pegawai.setGolongan(golongan);
				pegawai.setIsActive(rs.getBoolean("peg_active"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return pegawai;
	}

	public void delete(String nip) {
		String sql = "update m_pegawai set peg_active = false where peg_nip = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, nip);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
