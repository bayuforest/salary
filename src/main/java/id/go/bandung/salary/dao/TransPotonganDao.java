package id.go.bandung.salary.dao;

import java.util.List;

import id.go.bandung.salary.model.Potongan;
import id.go.bandung.salary.model.TransPotongan;

public interface TransPotonganDao {
	public List<TransPotongan> getAll();

	public void add(TransPotongan t);

	public void edit(TransPotongan t);

	public TransPotongan findTransPotongan(Integer tahun, Integer bulan,
			String nip, Potongan potongan);
}
