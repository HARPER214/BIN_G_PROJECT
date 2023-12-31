package com.bing.community.model.dto;

public class Favorite {
	private int user_email;
	private int location_id;
	private int favorite_id;

	public Favorite(int user_email, int location_id, int favorite_id) {
		super();
		this.user_email = user_email;
		this.location_id = location_id;
		this.favorite_id = favorite_id;
	}

	public int getUser_email() {
		return user_email;
	}

	public void setUser_email(int user_email) {
		this.user_email = user_email;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public int getFavorite_id() {
		return favorite_id;
	}

	public void setFavorite_id(int favorite_id) {
		this.favorite_id = favorite_id;
	}

}
