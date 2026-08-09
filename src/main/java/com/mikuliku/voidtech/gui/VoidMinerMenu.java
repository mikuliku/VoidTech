package com.mikuliku.voidtech.gui;


import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;



public class VoidMinerMenu extends AbstractContainerMenu {


    public VoidMinerMenu(
            int id,
            Inventory inventory,
            FriendlyByteBuf data
    ){
        super(null,id);
    }



    @Override
    public boolean stillValid(Player player){

        return true;

    }



    @Override
    public ItemStack quickMoveStack(
            Player player,
            int index
    ){

        return ItemStack.EMPTY;

    }

}
