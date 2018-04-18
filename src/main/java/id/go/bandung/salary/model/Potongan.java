package id.go.bandung.salary.model;

public class Potongan {
	private Integer potId;
	private String potName;

	public Integer getPotId() {
		return potId;
	}

	public void setPotId(Integer potId) {
		this.potId = potId;
	}

	public String getPotName() {
		return potName;
	}

	public void setPotName(String potName) {
		this.potName = potName;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[id = ");
		sb.append(potId);
		sb.append(", name = ");
		sb.append(potName);
		sb.append("]");
		return sb.toString();
	}
}
