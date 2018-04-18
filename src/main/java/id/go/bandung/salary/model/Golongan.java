package id.go.bandung.salary.model;

public class Golongan {
	private Integer golId;
	private String golName;
	private String golPangkat;

	public Integer getGolId() {
		return golId;
	}

	public void setGolId(Integer golId) {
		this.golId = golId;
	}

	public String getGolName() {
		return golName;
	}

	public void setGolName(String golName) {
		this.golName = golName;
	}

	public String getGolPangkat() {
		return golPangkat;
	}

	public void setGolPangkat(String golPangkat) {
		this.golPangkat = golPangkat;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[id =");
		sb.append(this.golId);
		sb.append(", name = ");
		sb.append(this.golName);
		sb.append(", pangkat = ");
		sb.append(this.golPangkat);
		sb.append("]");
		return sb.toString();
	}
}
