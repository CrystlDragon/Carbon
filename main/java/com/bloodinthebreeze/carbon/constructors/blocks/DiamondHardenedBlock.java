package com.bloodinthebreeze.carbon.constructors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class DiamondHardenedBlock extends Block
{
    public DiamondHardenedBlock()
    {
        super
                (
                        Block.Properties.create(Material.IRON)
                                .hardnessAndResistance(5.0f, 6.0f)
                                .sound(SoundType.METAL)
                                .harvestLevel(3)
                                .harvestTool(ToolType.PICKAXE)
                );
    }
}
