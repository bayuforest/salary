package id.go.bandung.salary.model;

public class Pegawai {
	public String nip;
	public String gelarDepan;
	public String nama;
	public String gelarBelakang;
	public String npwp;
	public String jabatan;
	public String email;
	public Integer gapok;
	public Golongan golongan;
	public Boolean isActive;

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public String getGelarDepan() {
		return gelarDepan;
	}

	public void setGelarDepan(String gelarDepan) {
		this.gelarDepan = gelarDepan;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getGelarBelakang() {
		return gelarBelakang;
	}

	public void setGelarBelakang(String gelarBelakang) {
		this.gelarBelakang = gelarBelakang;
	}

	public String getNpwp() {
		return npwp;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	public String getJabatan() {
		return jabatan;
	}

	public void setJabatan(String jabatan) {
		this.jabatan = jabatan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGapok() {
		return gapok;
	}

	public void setGapok(Integer gapok) {
		this.gapok = gapok;
	}

	public Golongan getGolongan() {
		return golongan;
	}

	public void setGolongan(Golongan golongan) {
		this.golongan = golongan;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[nip = ");
		sb.append(nip);
		sb.append(", gelarDepan = ");
		sb.append(gelarDepan);
		sb.append(", nama = ");
		sb.append(nama);
		sb.append(", gelarBelakang = ");
		sb.append(gelarBelakang);
		sb.append(", npwp = ");
		sb.append(npwp);
		sb.append(", jabatan = ");
		sb.append(jabatan);
		sb.append(", email = ");
		sb.append(email);
		sb.append(", gapok = ");
		sb.append(gapok);
		sb.append(", Gol = ");
		sb.append(golongan);
		sb.append(", isActive = ");
		sb.append(isActive);
		sb.append("]");
		return sb.toString();
	}

}
