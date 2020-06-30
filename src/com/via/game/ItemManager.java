package com.via.game;

import java.util.HashMap;
import java.util.Map;

public class ItemManager {
	private long mCurrentGUID = 100000000000L;

	private HashMap mItemMap = new HashMap();

	public ItemManager() {
		initItems();
	}

	private void initItems() {
		mItemMap.put(ItemDef.RED_STICK, "red stick");
		mItemMap.put(ItemDef.HEALING_POTION, "healing potion");
		mItemMap.put(ItemDef.ROTTEN_APPLE, "rotten apple");
		mItemMap.put(ItemDef.SHORT_KNIFE, "short knife");
		mItemMap.put(ItemDef.DAGGER, "dagger");
		mItemMap.put(ItemDef.AXE, "axe");
		mItemMap.put(ItemDef.DIRTY_PANTS, "dirty pants");
		mItemMap.put(ItemDef.BLONDIE_HAIR, "blondie hair");
		mItemMap.put(ItemDef.TELEPORT_SCROLL, "teleport scroll");
	}

	public long getGuid() {
		mCurrentGUID += 1;
		return mCurrentGUID;
	}

	public Item createItem(int itemCode, int itemCount) {
		Object itemNameObj = mItemMap.get(itemCode);
		if (itemNameObj == null)
			return null;
		
		return Item.createItem((String)itemNameObj, itemCode, getGuid(), itemCount);
	}
}
