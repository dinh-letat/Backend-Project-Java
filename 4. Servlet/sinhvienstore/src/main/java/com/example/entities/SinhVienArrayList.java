package com.example.entities;

import java.util.ArrayList;

public class SinhVienArrayList {
	ArrayList<String> dssv = new ArrayList<>();
	
	public void addSinhVien(String sv) {
		dssv.add(sv);
	}
	public void delSinhVien(String sv) {
		dssv.remove(sv);
	}
}
