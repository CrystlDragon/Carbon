package com.bloodinthebreeze.carbon.constructors.Items;

import com.bloodinthebreeze.carbon.Carbon;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class FuelItemBase extends Item
{
    public FuelItemBase(Properties properties)
    {
        super(new Properties().group(Carbon.TAB));
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 600;
    }
}
