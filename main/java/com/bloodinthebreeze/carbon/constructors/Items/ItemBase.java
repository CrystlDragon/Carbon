package com.bloodinthebreeze.carbon.constructors.Items;

import com.bloodinthebreeze.carbon.Carbon;
import net.minecraft.item.Item;

public class ItemBase extends Item
{


    public ItemBase() {
        super(new Properties().group(Carbon.TAB));
    }
}
