package com.example.examplemod.init;

import com.example.examplemod.items.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    /**
     * 创建一个物品
     */
    public static final Item OBSIDIAN_INGOT  = new ItemBase("obsidian_ingot", CreativeTabs.MATERIALS);
}
