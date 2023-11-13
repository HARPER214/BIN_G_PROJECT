package com.bing.community.model.dto;

public class Board {
	private int id;
	private int community_id;
	private int num;
	private String title;
	private String writer;
	private String content;
	private String reg_date;
	private boolean is_modified;
	private int location_id;

	public Board(int id, int community_id, int num, String title, String writer, String content, String reg_date,
			boolean is_modified, int location_id) {
		super();
		this.id = id;
		this.community_id = community_id;
		this.num = num;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
		this.is_modified = is_modified;
		this.location_id = location_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCommunity_id() {
		return community_id;
	}

	public void setCommunity_id(int community_id) {
		this.community_id = community_id;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

	public boolean isIs_modified() {
		return is_modified;
	}

	public void setIs_modified(boolean is_modified) {
		this.is_modified = is_modified;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

}
