package com.example.examplemod.util;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.blocks.PancakeBlock;
import com.example.examplemod.items.Foods;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //Lista di tutti gli oggetti della mod
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    //Lista di tutti i blocchi della mod
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Blocchi
    public static final RegistryObject<Block> PANCAKE_BLOCK = BLOCKS.register("pancake_block", PancakeBlock::new);

    //Oggetti
    public static final RegistryObject<Item> PANCAKE = ITEMS.register("pancake",
            () -> new Item(new Item.Properties().group(ExampleMod.TAB).food(Foods.PANCAKE)));

    public static final RegistryObject<Item> PANCAKE_BLOCK_ITEM = ITEMS.register("pancake_block",
            () -> new BlockItem(PANCAKE_BLOCK.get(), new Item.Properties().group(ExampleMod.TAB)));
}
