package com.example.SpringRestfulAPI.model;

public class Greeting {
	private long id;
	private String content;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Greeting(int id, String content) {
		super();
		this.id = id;
		this.content = "This is a new content";
	}
	public Greeting() {
		this.content = "This is a new content";
	}
	
	
}
