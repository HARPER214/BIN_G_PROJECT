package com.bing.community.model.dto;

public class Location {
	private int id;
	private String title;
	private String 위도;
	private String 경도;

	public Location(int id, String title, String 위도, String 경도) {
		super();
		this.id = id;
		this.title = title;
		this.위도 = 위도;
		this.경도 = 경도;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String get위도() {
		return 위도;
	}

	public void set위도(String 위도) {
		this.위도 = 위도;
	}

	public String get경도() {
		return 경도;
	}

	public void set경도(String 경도) {
		this.경도 = 경도;
	}

}
