package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;

import net.minecraft.world.inventory.MenuType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ModMenus {


    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(
                    ForgeRegistries.MENU_TYPES,
                    VoidTech.MOD_ID
            );



}
