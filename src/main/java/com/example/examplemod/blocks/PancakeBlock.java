package com.example.examplemod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class PancakeBlock extends CakeBlock {

    public PancakeBlock() {
        super(Block.Properties.create(Material.CAKE)
        .hardnessAndResistance(0.5f, 0.5f)
        .sound(SoundType.CLOTH));
    }
}
