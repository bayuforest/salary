package id.go.bandung.salary.model;

public class TransPotongan {
	private Integer tahun;
	private Integer bulan;
	private String nip;
	private Potongan potongan;
	private Integer potValue;

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

	public Potongan getPotongan() {
		return potongan;
	}

	public void setPotongan(Potongan potongan) {
		this.potongan = potongan;
	}

	public Integer getPotValue() {
		return potValue;
	}

	public void setPotValue(Integer potValue) {
		this.potValue = potValue;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[tahun = ");
		sb.append(tahun);
		sb.append(", bulan = ");
		sb.append(bulan);
		sb.append(", nip = ");
		sb.append(nip);
		sb.append(", potongan = ");
		sb.append(potongan);
		sb.append(", potValue = ");
		sb.append(potValue);
		sb.append("]");
		return sb.toString();
		
	}

}
