package model.Bean;

public class Vacxin {
	private String maVacxin;
	private String tenVacxin;
	private int soMui;
	private String moTa;
	private double giaVacxin;
	private String tenHangSanXuat;
	
	public Vacxin() {
	}
	
	
	public Vacxin(String maVacxin, String tenVacxin, int soMui, String moTa, double giaVacxin, String tenHangSanXuat) {
		this.maVacxin = maVacxin;
		this.tenVacxin = tenVacxin;
		this.soMui = soMui;
		this.moTa = moTa;
		this.giaVacxin = giaVacxin;
		this.tenHangSanXuat = tenHangSanXuat;
	}


	public String getMaVacxin() {
		return maVacxin;
	}

	public void setMaVacxin(String maVacxin) {
		this.maVacxin = maVacxin;
	}

	public String getTenVacxin() {
		return tenVacxin;
	}

	public void setTenVacxin(String tenVacxin) {
		this.tenVacxin = tenVacxin;
	}

	public int getSoMui() {
		return soMui;
	}

	public void setSoMui(int soMui) {
		this.soMui = soMui;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public double getGiaVacxin() {
		return giaVacxin;
	}

	public void setGiaVacxin(double giaVacxin) {
		this.giaVacxin = giaVacxin;
	}

	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	
	
}
