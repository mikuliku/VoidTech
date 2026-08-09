package com.mikuliku.voidtech;


import com.mikuliku.voidtech.registry.ModBlocks;
import com.mikuliku.voidtech.registry.ModItems;


import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(VoidTech.MOD_ID)
public class VoidTech {


    public static final String MOD_ID = "voidtech";


    public VoidTech(){


        IEventBus bus =
                FMLJavaModLoadingContext
                        .get()
                        .getModEventBus();



        ModBlocks.BLOCKS.register(bus);

        ModItems.ITEMS.register(bus);


    }

}
