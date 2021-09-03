package com.example.examplemod.items;

import com.example.examplemod.Main;
import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//所有物品的基类
public class ItemBase extends Item implements IHasModel {

    /**
     * 创建物品
     * @param name 物品名字
     * @param creativeTabs 创造模式在那个归属栏
     */
    public ItemBase(String name, CreativeTabs creativeTabs) {
        //设置名字
        setUnlocalizedName(name);
        setRegistryName(name);
        //设置创造模式物品归属栏
        setCreativeTab(creativeTabs);

        //再开启mod的时候将所有的mod物品注入(所有的物品初始化都要经过这个方法)
        ModItems.ITEMS.add(this);

    }

    /**
     * 注册model
     */
    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
