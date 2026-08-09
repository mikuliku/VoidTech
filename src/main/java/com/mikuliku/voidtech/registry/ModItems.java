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



    public static final RegistryObject<Item> VOID_CRYSTAL_ORE =
            ITEMS.register(
                    "void_crystal_ore",
                    () ->
                            new BlockItem(
                                    ModBlocks.VOID_CRYSTAL_ORE.get(),
                                    new Item.Properties()
                            )
            );



    public static final RegistryObject<Item> VOID_CORE =
            ITEMS.register(
                    "void_core",
                    () ->
                            new BlockItem(
                                    ModBlocks.VOID_CORE.get(),
                                    new Item.Properties()
                            )
            );



    public static final RegistryObject<Item> MACHINE_FRAME =
            ITEMS.register(
                    "machine_frame",
                    () ->
                            new BlockItem(
                                    ModBlocks.MACHINE_FRAME.get(),
                                    new Item.Properties()
                            )
            );


}
