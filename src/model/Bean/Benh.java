package model.Bean;

public class Benh {
	private String maBenh;
	private String tenBenh;
	private String moTa;
	
	public Benh() {
	}

	public Benh(String maBenh, String tenBenh, String moTa) {
		this.maBenh = maBenh;
		this.tenBenh = tenBenh;
		this.moTa = moTa;
	}

	public String getMaBenh() {
		return maBenh;
	}

	public void setMaBenh(String maBenh) {
		this.maBenh = maBenh;
	}

	public String getTenBenh() {
		return tenBenh;
	}

	public void setTenBenh(String tenBenh) {
		this.tenBenh = tenBenh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	
	
}
