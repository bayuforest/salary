package id.go.bandung.salary.dao;

import java.util.List;

import id.go.bandung.salary.model.TransGajiBersih;

public interface TransGajiBersihDao {
	public List<TransGajiBersih> getAll();

	public void add(TransGajiBersih t);

	public void edit(TransGajiBersih t);

	public TransGajiBersih find(Integer tahun, Integer bulan,
			String nip);
}
