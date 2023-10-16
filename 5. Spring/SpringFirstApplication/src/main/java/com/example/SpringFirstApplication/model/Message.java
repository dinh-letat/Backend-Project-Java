package com.example.SpringFirstApplication.model;

public class Message {
	private String ten;
	private String tuoi;
	private String mesage;
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getTuoi() {
		return tuoi;
	}
	public void setTuoi(String tuoi) {
		this.tuoi = tuoi;
	}
	public String getMesage() {
		return mesage;
	}
	public void setMesage(String mesage) {
		this.mesage = mesage;
	}
	public Message(String ten, String tuoi, String mesage) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.mesage = mesage;
	}
	public Message() {
		this.mesage = "This is new message";
	}
	
	
}
