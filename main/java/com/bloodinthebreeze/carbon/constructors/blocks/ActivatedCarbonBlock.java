package com.bloodinthebreeze.carbon.constructors.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ActivatedCarbonBlock extends Block
{
    public ActivatedCarbonBlock()
    {
        super
                (
                        net.minecraft.block.Block.Properties.create(Material.IRON)
                                .hardnessAndResistance(2.0f, 3.0f)
                                .sound(SoundType.METAL)
                                .harvestLevel(0)
                                .harvestTool(ToolType.PICKAXE)
                );
    }
}
