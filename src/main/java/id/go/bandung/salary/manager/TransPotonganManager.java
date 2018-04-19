package id.go.bandung.salary.manager;

import id.go.bandung.salary.model.Potongan;
import id.go.bandung.salary.model.TransPotongan;

import java.util.List;

public interface TransPotonganManager {
	public List<TransPotongan> getAll();

	public void add(TransPotongan t);

	public void edit(TransPotongan t);

	public TransPotongan findTransPotongan(Integer tahun, Integer bulan,
			String nip, Potongan potongan);
}
