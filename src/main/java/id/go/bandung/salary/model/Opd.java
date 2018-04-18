package id.go.bandung.salary.model;

public class Opd {
	private String namaOpd;

	public String getNamaOpd() {
		return namaOpd;
	}

	public void setNamaOpd(String namaOpd) {
		this.namaOpd = namaOpd;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		return sb.append("= [").append(this.namaOpd).append("]").toString();
	}

}
