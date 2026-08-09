package com.mikuliku.voidtech;


import com.mikuliku.voidtech.registry.ModBlocks;
import com.mikuliku.voidtech.registry.ModMinerBlocks;

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



        // 注册普通方块
        ModBlocks.BLOCKS.register(modEventBus);



        // 注册虚空机器方块
        ModMinerBlocks.BLOCKS.register(modEventBus);


    }


}
