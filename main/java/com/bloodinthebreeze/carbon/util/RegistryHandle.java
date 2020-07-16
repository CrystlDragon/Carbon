package com.bloodinthebreeze.carbon.util;

import com.bloodinthebreeze.carbon.Carbon;
import com.bloodinthebreeze.carbon.constructors.ItemBase;
import com.bloodinthebreeze.carbon.constructors.blocks.BlockItemBase;
import com.bloodinthebreeze.carbon.constructors.blocks.SiliconBlock;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandle
{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Carbon.ModId);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Carbon.ModId);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> COKE = ITEMS.register("coke", ItemBase::new);
    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite", ItemBase::new);
    public static final RegistryObject<Item> FIBER_CARBON = ITEMS.register("carbon_fiber", ItemBase::new);
    public static final RegistryObject<Item> GRAPHENE = ITEMS.register("graphene", ItemBase::new);
    public static final RegistryObject<Item> DIAMANE = ITEMS.register("diamane", ItemBase::new);
    public static final RegistryObject<Item> LONSDALEITE = ITEMS.register("lonsdaleite", ItemBase::new);
    public static final RegistryObject<Item> DIAMOND_HARDENED = ITEMS.register("hardened_diamond", ItemBase::new);
    public static final RegistryObject<Item> LOW_CARBON_STEEL_INGOT = ITEMS.register("low_carbon_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> MEDIUM_CARBON_STEEL_INGOT = ITEMS.register("medium_carbon_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register("high_carbon_steel_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", ItemBase::new);
    public static final RegistryObject<Item> TUNGSTEN_CARBIDE_INGOT = ITEMS.register("tungsten_carbide_ingot", ItemBase::new);
    public static final RegistryObject<Item> SILICON_CARBIDE_INGOT = ITEMS.register("silicon_carbide_ingot", ItemBase::new);

    //blocks
    public static final RegistryObject<Block> SILICON_BLOCK = BLOCKS.register("block_silicon", SiliconBlock::new);

    //block items
    public static final RegistryObject<Item> SILICON_BLOCK_ITEM = ITEMS.register("silicon_block", () -> new BlockItemBase(SILICON_BLOCK.get()));

}