package com.mikuliku.voidtech.menu;


import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;


public class VoidMinerMenu extends AbstractContainerMenu {


    public VoidMinerMenu(
            int id,
            Inventory inventory
    ){
        super(null,id);
    }


    public VoidMinerMenu(
            int id,
            Inventory inventory,
            MenuType<?> type
    ){
        super(type,id);
    }


    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}
