package com.bloodinthebreeze.carbon.util;

import com.bloodinthebreeze.carbon.Carbon;
import com.bloodinthebreeze.carbon.constructors.Items.ItemBase;
import com.bloodinthebreeze.carbon.constructors.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Carbon.ModId);

    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, Carbon.ModId);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
        //with blocks
            public static final RegistryObject<Item> COKE = ITEMS.register("coke", ItemBase::new);
            public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite", ItemBase::new);
            public static final RegistryObject<Item> FIBER_CARBON = ITEMS.register("carbon_fiber", ItemBase::new);
            public static final RegistryObject<Item> GRAPHENE = ITEMS.register("graphene", ItemBase::new);
            public static final RegistryObject<Item> DIAMANE = ITEMS.register("diamane", ItemBase::new);
            public static final RegistryObject<Item> LONSDALEITE = ITEMS.register("lonsdaleite", ItemBase::new);
            public static final RegistryObject<Item> ACTIVATED_CARBON = ITEMS.register("activated_carbon", ItemBase::new);

        //without blocks
            public static final RegistryObject<Item> DIAMOND_HARDENED = ITEMS.register("hardened_diamond", ItemBase::new);
            public static final RegistryObject<Item> LOW_CARBON_STEEL_INGOT = ITEMS.register("low_carbon_steel_ingot", ItemBase::new);
            public static final RegistryObject<Item> MEDIUM_CARBON_STEEL_INGOT = ITEMS.register("medium_carbon_steel_ingot", ItemBase::new);
            public static final RegistryObject<Item> HIGH_CARBON_STEEL_INGOT = ITEMS.register("high_carbon_steel_ingot", ItemBase::new);
            public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", ItemBase::new);
            public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot", ItemBase::new);
            public static final RegistryObject<Item> TUNGSTEN_CARBIDE_INGOT = ITEMS.register("tungsten_carbide_ingot", ItemBase::new);
            public static final RegistryObject<Item> SILICON_CARBIDE_INGOT = ITEMS.register("silicon_carbide_ingot", ItemBase::new);

    //blocks
        public static final RegistryObject<Block> DIAMOND_HARDENED_BLOCK = BLOCKS.register("hardened_diamond_block", DiamondHardenedBlock::new);
        public static final RegistryObject<Block> LOW_CARBON_STEEL_BLOCK = BLOCKS.register("low_carbon_steel_block", LowCarbonSteelBlock::new);
        public static final RegistryObject<Block> MEDIUM_CARBON_STEEL_BLOCK = BLOCKS.register("medium_carbon_steel_block", MediumCarbonSteelBlock::new);
        public static final RegistryObject<Block> HIGH_CARBON_STEEL_BLOCK = BLOCKS.register("high_carbon_steel_block", HighCarbonSteelBlock::new);
        public static final RegistryObject<Block> TUNGSTEN_BLOCK = BLOCKS.register("tungsten_block", TungstenBlock::new);
        public static final RegistryObject<Block> SILICON_BLOCK = BLOCKS.register("silicon_block", SiliconBlock::new);
        public static final RegistryObject<Block> SILICON_CARBIDE_BLOCK = BLOCKS.register("silicon_carbide_block", SiliconCarbideBlock::new);
        public static final RegistryObject<Block> TUNGSTEN_CARBIDE_BLOCK = BLOCKS.register("tungsten_carbide_block", TungstenCarbideBlock::new);
        public static final RegistryObject<Block> COKE_BLOCK = BLOCKS.register("coke_block", CokeBlock::new);
        public static final RegistryObject<Block> ACTIVATED_CARBON_BLOCK = BLOCKS.register("activated_carbon_block", ActivatedCarbonBlock::new);


    //block items
        public static final RegistryObject<Item> SILICON_BLOCK_ITEM = ITEMS.register("silicon_block", () -> new BlockItemBase(SILICON_BLOCK.get()));
        public static final RegistryObject<Item> SILICON_CARBIDE_BLOCK_ITEM = ITEMS.register("silicon_carbide_block", () -> new BlockItemBase(SILICON_CARBIDE_BLOCK.get()));
        public static final RegistryObject<Item> DIAMOND_HARDENED_BLOCK_ITEM = ITEMS.register("hardened_diamond_block", () -> new BlockItemBase(DIAMOND_HARDENED_BLOCK.get()));
        public static final RegistryObject<Item> LOW_CARBON_STEEL_BLOCK_ITEM = ITEMS.register("low_carbon_steel_block", () -> new BlockItemBase(LOW_CARBON_STEEL_BLOCK.get()));
        public static final RegistryObject<Item> MEDIUM_CARBON_STEEL_BLOCK_ITEM = ITEMS.register("medium_carbon_steel_block", () -> new BlockItemBase(MEDIUM_CARBON_STEEL_BLOCK.get()));
        public static final RegistryObject<Item> HIGH_CARBON_STEEL_BLOCK_ITEM = ITEMS.register("high_carbon_steel_block", () -> new BlockItemBase(HIGH_CARBON_STEEL_BLOCK.get()));
        public static final RegistryObject<Item> TUNGSTEN_BLOCK_ITEM = ITEMS.register("tungsten_block", () -> new BlockItemBase(TUNGSTEN_BLOCK.get()));
        public static final RegistryObject<Item> TUNGSTEN_CARBIDE_BLOCK_ITEM = ITEMS.register("tungsten_carbide_block", () -> new BlockItemBase(TUNGSTEN_CARBIDE_BLOCK.get()));
        public static final RegistryObject<Item> COKE_BLOCK_ITEM = ITEMS.register("coke_block", () -> new BlockItemBase(COKE_BLOCK.get()));
        public static final RegistryObject<Item> ACTIVATED_CARBON_BLOCK_ITEM = ITEMS.register("activated_carbon_block", () -> new BlockItemBase(ACTIVATED_CARBON_BLOCK.get()));

}
