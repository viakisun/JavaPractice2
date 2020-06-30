package com.via.game;

import java.util.ArrayList;

public class Character {

	private String mName;
	private int mLevel;

	private ArrayList<Item> mItems;
	private ArrayList<Skill> mSkills;

	private long mGUID;

	private ItemManager mItemManager;

	public Character(String name, long guid) {
		mName = name;
		mLevel = 1;
		mItems = new ArrayList<Item>();
		mSkills = new ArrayList<Skill>();
		mGUID = guid;

		mItemManager = new ItemManager();

		initItems();
	}

	private void initItems() {
		createItem(ItemDef.AXE, 1);
		createItem(ItemDef.HEALING_POTION, 3);
		createItem(ItemDef.DIRTY_PANTS, 1);
		createItem(ItemDef.DAGGER, 1);
	}

	public boolean createItem(int itemCode, int itemCount) {
		mItems.add(mItemManager.createItem(itemCode, itemCount));
		return true;
	}

	public boolean removeItem(long guid) {
		return true;
	}
}
