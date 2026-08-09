package com.mikuliku.voidtech;


import com.mikuliku.voidtech.registry.ModBlocks;
import com.mikuliku.voidtech.registry.ModMinerBlocks;
import com.mikuliku.voidtech.registry.ModBlockEntities;
import com.mikuliku.voidtech.registry.ModItems;


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



        // 基础方块注册
        ModBlocks.BLOCKS.register(modEventBus);



        // 虚空机器方块注册
        ModMinerBlocks.BLOCKS.register(modEventBus);



        // 方块实体注册
        ModBlockEntities.BLOCK_ENTITIES.register(modEventBus);



        // 物品注册
        ModItems.ITEMS.register(modEventBus);


    }


}
