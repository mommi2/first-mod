package com.example.examplemod.util;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    //Lista di tutti gli oggetti della mod
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    //Oggetti
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
