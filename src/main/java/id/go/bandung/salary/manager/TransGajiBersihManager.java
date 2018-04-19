package id.go.bandung.salary.manager;

import id.go.bandung.salary.model.TransGajiBersih;

import java.util.List;

public interface TransGajiBersihManager {
	public List<TransGajiBersih> getAll();

	public void add(TransGajiBersih t);

	public void edit(TransGajiBersih t);

	public TransGajiBersih find(Integer tahun, Integer bulan,
			String nip);
}
