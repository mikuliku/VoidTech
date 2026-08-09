package com.mikuliku.voidtech.registry;

import com.mikuliku.voidtech.VoidTech;
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


    public static final RegistryObject<Item> VOID_CRYSTAL =
            ITEMS.register(
                    "void_crystal",
                    () -> new Item(
                            new Item.Properties()
                    )
            );

}
