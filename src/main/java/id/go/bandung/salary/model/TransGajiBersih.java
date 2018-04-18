package id.go.bandung.salary.model;

public class TransGajiBersih {
	private Integer tahun;
	private Integer bulan;
	private String nip;
	private Integer gapok;
	private Integer gaber;

	public Integer getTahun() {
		return tahun;
	}

	public void setTahun(Integer tahun) {
		this.tahun = tahun;
	}

	public Integer getBulan() {
		return bulan;
	}

	public void setBulan(Integer bulan) {
		this.bulan = bulan;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	public Integer getGapok() {
		return gapok;
	}

	public void setGapok(Integer gapok) {
		this.gapok = gapok;
	}

	public Integer getGaber() {
		return gaber;
	}

	public void setGaber(Integer gaber) {
		this.gaber = gaber;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[tahun = ");
		sb.append(tahun);
		sb.append(", bulan = ");
		sb.append(bulan);
		sb.append(", nip = ");
		sb.append(nip);
		sb.append(", gapok = ");
		sb.append(gapok);
		sb.append(", gaber = ");
		sb.append(gaber);
		sb.append("]");
		return sb.toString();
	}
}
