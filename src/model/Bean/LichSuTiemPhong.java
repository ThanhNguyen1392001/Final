package model.Bean;

import java.sql.Date;

public class LichSuTiemPhong {
	private String maKH;
	private String maVacxin;
	private String sttMui;
	private Date ngayTiemPhong;
	private Date ngayHenTiepTheo;
	
	public LichSuTiemPhong() {
	}

	public LichSuTiemPhong(String maKH, String maVacxin, String sttMui, Date ngayTiemPhong, Date ngayHenTiepTheo) {
		this.maKH = maKH;
		this.maVacxin = maVacxin;
		this.sttMui = sttMui;
		this.ngayTiemPhong = ngayTiemPhong;
		this.ngayHenTiepTheo = ngayHenTiepTheo;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getMaVacxin() {
		return maVacxin;
	}

	public void setMaVacxin(String maVacxin) {
		this.maVacxin = maVacxin;
	}

	public String getSttMui() {
		return sttMui;
	}

	public void setSttMui(String sttMui) {
		this.sttMui = sttMui;
	}

	public Date getNgayTiemPhong() {
		return ngayTiemPhong;
	}

	public void setNgayTiemPhong(Date ngayTiemPhong) {
		this.ngayTiemPhong = ngayTiemPhong;
	}

	public Date getNgayHenTiepTheo() {
		return ngayHenTiepTheo;
	}

	public void setNgayHenTiepTheo(Date ngayHenTiepTheo) {
		this.ngayHenTiepTheo = ngayHenTiepTheo;
	}
	
	
}
