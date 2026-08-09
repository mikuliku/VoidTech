package com.mikuliku.voidtech;


import com.mikuliku.voidtech.registry.ModBlocks;
import com.mikuliku.voidtech.registry.ModMinerBlocks;
import com.mikuliku.voidtech.registry.ModBlockEntities;
import com.mikuliku.voidtech.registry.ModItems;
import com.mikuliku.voidtech.registry.ModInterfaceBlocks;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;



@Mod(VoidTech.MOD_ID)
public final class VoidTech {


    public static final String MOD_ID = "voidtech";



    public VoidTech() {


        var modEventBus =
                FMLJavaModLoadingContext
                        .get()
                        .getModEventBus();



        ModBlocks.BLOCKS.register(modEventBus);


        ModMinerBlocks.BLOCKS.register(modEventBus);


        ModInterfaceBlocks.BLOCKS.register(modEventBus);


        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);


        ModItems.ITEMS.register(modEventBus);


    }


}
