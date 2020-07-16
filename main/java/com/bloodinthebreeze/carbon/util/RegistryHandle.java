package com.bloodinthebreeze.carbon.util;

import com.bloodinthebreeze.carbon.Carbon;
import com.bloodinthebreeze.carbon.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandle
{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Carbon.ModId);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", ItemBase::new);
    public static final RegistryObject<Item> FIBER_CARBON = ITEMS.register("fiber_carbon", ItemBase::new);
    

}