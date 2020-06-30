package com.via.game;

import java.util.ArrayList;

public class Character {

	private String mName;
	private int mLevel;

	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;

	private long mGUID;

	public Character(String name, long guid) {
		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;
	}

	public boolean getItem(Item item) {
		return true;
	}

	public boolean removeItem(long guid) {
		return true;
	}
}
