package com.example.examplemod.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        // Qui scegliamo in che tab del menu creative mettere l'oggetto
        super(new Item.Properties().group(ItemGroup.MATERIALS));
    }
}
