package com.mikuliku.voidtech.registry;


import com.mikuliku.voidtech.VoidTech;
import com.mikuliku.voidtech.gui.InterfaceMenu;
import com.mikuliku.voidtech.gui.VoidMinerMenu;


import net.minecraft.world.inventory.MenuType;

import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModMenuTypes {


    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(
                    ForgeRegistries.MENU_TYPES,
                    VoidTech.MOD_ID
            );



    public static final RegistryObject<MenuType<VoidMinerMenu>> VOID_MINER_MENU =
            MENUS.register(
                    "void_miner_menu",
                    () -> IForgeMenuType.create(VoidMinerMenu::new)
            );



    public static final RegistryObject<MenuType<InterfaceMenu>> INTERFACE_MENU =
            MENUS.register(
                    "interface_menu",
                    () -> IForgeMenuType.create(InterfaceMenu::new)
            );

}
