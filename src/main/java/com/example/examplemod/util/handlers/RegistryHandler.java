package com.example.examplemod.util.handlers;

import com.example.examplemod.init.ModItems;
import com.example.examplemod.util.IHasModel;
import com.google.common.eventbus.Subscribe;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.rmi.registry.Registry;

@Mod.EventBusSubscriber
public class RegistryHandler {


    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event){

        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event){

        for(Item item : ModItems.ITEMS){
            //如果这个物品实现了我的接口
            if(item instanceof IHasModel){
                ((IHasModel)item).registerModels();
            }
        }

    }

}
