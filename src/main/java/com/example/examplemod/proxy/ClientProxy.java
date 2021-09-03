package com.example.examplemod.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy{

    public void registerItemRenderer(Item item, int meta, String id){
        //设置mod的信息
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(
                item.getRegistryName(), id
        ));

    }

}
