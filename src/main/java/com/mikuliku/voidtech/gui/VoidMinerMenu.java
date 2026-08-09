package com.mikuliku.voidtech.gui;


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



    @Override
    public boolean stillValid(Player player){

        return true;

    }


}
