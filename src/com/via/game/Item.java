package com.via.game;

public class Item {
	private String mName;
	private int mItemCode;
	private int mItemCount;
	private long mGUID;

	public Item(String name, int itemCode, long guid, int itemCount) {
		mName = name;
		mItemCode = itemCode;
		mGUID = guid;
		mItemCount = itemCount;
	}
	
	public static Item createItem(String name, int itemCode, long guid, int itemCount) {
		return new Item(name, itemCode, guid, itemCount);
	}
}
