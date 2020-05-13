package com.example.examplemod;

import com.example.examplemod.list.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ExampleItemGroup extends ItemGroup {

    public ExampleItemGroup() {
        super("example");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemList.pancake);
    }
}
