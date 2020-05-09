package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PancakeBlock extends Block {

    public PancakeBlock() {
        super(Block.Properties.create(Material.CAKE)
        .hardnessAndResistance(0.5f, 0.5f)
        .sound(SoundType.SNOW));
    }
}
