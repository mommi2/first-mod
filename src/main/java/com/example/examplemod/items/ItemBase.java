package com.example.examplemod.items;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase() {
        // Qui scegliamo in che tab del menu creative mettere l'oggetto
        super(new Item.Properties().group(ExampleMod.TAB));
    }
}
