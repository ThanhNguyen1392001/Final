package model.Bean;

import java.sql.Date;

public class KhachHang {
	private String maKH;
	private String hoTenKH;
	private String soDienThoai;
	private String DiaChiKH;
	private Date NgaySinh;
	private String GioiTinh;
	
	public KhachHang() {
	}

	public KhachHang(String maKH, String hoTenKH, String soDienThoai, String diaChiKH, Date ngaySinh, String gioiTinh) {
		this.maKH = maKH;
		this.hoTenKH = hoTenKH;
		this.soDienThoai = soDienThoai;
		DiaChiKH = diaChiKH;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTenKH() {
		return hoTenKH;
	}

	public void setHoTenKH(String hoTenKH) {
		this.hoTenKH = hoTenKH;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getDiaChiKH() {
		return DiaChiKH;
	}

	public void setDiaChiKH(String diaChiKH) {
		DiaChiKH = diaChiKH;
	}

	public Date getNgaySinh() {
		return NgaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return GioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	
	
}
