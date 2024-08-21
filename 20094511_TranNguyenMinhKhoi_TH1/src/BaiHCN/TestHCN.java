package BaiHCN;

import java.util.Scanner;

public class TestHCN {
	// In tieu de
	public static void inTieuDe() {
		for (int i = 0; i < 44; i++) {
			System.out.printf("-");
		}
		System.out.println("");
		System.out.printf("|%10s|%10s|%10s|%10s|", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
		System.out.println();
		for (int i = 0; i < 44; i++) {
			System.out.printf("-");
		}
	}
	
	//In khoang cach giua cac hinh
	public static void inKhoangCach() {
		for (int i = 0; i < 44; i++) {
			System.out.printf("_");
		}
	}
	
	//Hinh chu nhat nhap mem
	public static HinhChuNhat nhapMem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double d = sc.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double r = sc.nextDouble();
		
		HinhChuNhat hnm = new HinhChuNhat();
		hnm.setChieuDai(d);
		hnm.setChieuRong(r);
		return hnm;
	}
	//Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hinh h1
		HinhChuNhat h1 = new HinhChuNhat();
		h1.setChieuDai(21);
		h1.setChieuRong(4);
		inTieuDe();
		System.out.println();
		System.out.println(h1.toString());
		inKhoangCach();
		
		//Hinh h2
		HinhChuNhat h2 = new HinhChuNhat(24, 4);
		System.out.println();
		inTieuDe();
		System.out.println();
		System.out.println(h2.toString());
		inKhoangCach();
		
		//Hinh nhap mem
		System.out.println();
		HinhChuNhat hnm = nhapMem();
		System.out.println();
		inTieuDe();
		System.out.println();
//		System.out.println("Chieu dai: " + hnm.getChieuDai());
//		System.out.println("Chieu rong: " + hnm.getChieuRong());
		System.out.println(hnm.toString());
		inKhoangCach();
	}
}
