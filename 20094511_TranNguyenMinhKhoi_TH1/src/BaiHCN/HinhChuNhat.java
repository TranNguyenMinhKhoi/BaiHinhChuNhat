package BaiHCN;

public class HinhChuNhat {
	//khai bao
	private double chieuDai;
	private double chieuRong;
	
	// dong goi chieu dai
	public double getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(double d) {
		if (d > 0) {
			this.chieuDai = d;
		}else {
			System.out.println("Loi! Chieu dai phai > 0!");
		}
	}
	// dong goi chieu rong
	public double getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(double r) {
		if (r > 0) {
			this.chieuRong = r;
		}else {
			System.out.println("Loi! Chieu rong phai > 0!");
		}
	}
	public HinhChuNhat () {}
	public HinhChuNhat(double d, double r) {	
		if (d > 0) {
			this.chieuDai = d;
		}else {
			System.out.println("Loi! Chieu dai phai > 0!");
		}
		if (r > 0) {
			this.chieuRong = r;
		}else {
			System.out.println("Loi! Chieu rong phai > 0!");
		}
	}
	
	//Phuong thuc
	//Tinh chu vi
	public double getChuVi() {
		return (getChieuDai() + getChieuRong())*2;
	}
	//Tinh dien tich
	public double getDienTich() {
		return getChieuDai() * getChieuRong();
	}
	@Override
	public String toString() {
		String s = "";
		s = s+s.format("|%10s|%10s|%10s|%10s|", getChieuDai(), getChieuRong(), getChuVi(), getDienTich());
		return s;
	}
//	public static void nhapMem() {}
}
