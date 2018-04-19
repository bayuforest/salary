package id.go.bandung.salary.manager;

import java.util.List;

import id.go.bandung.salary.model.Pegawai;

public interface PegawaiManager {
	public List<Pegawai> getAll();

	public void add(Pegawai pegawai);

	public void edit(Pegawai pegawai);

	public Pegawai find(String nip);

	public void delete(String nip);
}
