package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {


    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(
                    ForgeRegistries.ITEMS,
                    VoidTech.MOD_ID
            );



    // =========================
    // 方块物品
    // =========================


    public static final RegistryObject<Item> VOID_CRYSTAL_ORE =
            ITEMS.register(
                    "void_crystal_ore",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.VOID_CRYSTAL_ORE.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> VOID_CORE =
            ITEMS.register(
                    "void_core",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.VOID_CORE.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> MACHINE_FRAME =
            ITEMS.register(
                    "machine_frame",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.MACHINE_FRAME.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> ENERGY_INTERFACE =
            ITEMS.register(
                    "energy_interface",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.ENERGY_INTERFACE.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> ITEM_INTERFACE =
            ITEMS.register(
                    "item_interface",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.ITEM_INTERFACE.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> FLUID_INTERFACE =
            ITEMS.register(
                    "fluid_interface",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.FLUID_INTERFACE.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> VOID_MINER =
            ITEMS.register(
                    "void_miner",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.VOID_MINER.get(),
                            new Item.Properties()
                    )
            );



    public static final RegistryObject<Item> VOID_INTERFACE =
            ITEMS.register(
                    "void_interface",
                    () -> new BlockItem(
                            com.mikuliku.voidtech.registry.ModBlocks.VOID_INTERFACE.get(),
                            new Item.Properties()
                    )
            );


}
