package com.mikuliku.voidtech.gui;


import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;

import net.minecraft.world.inventory.AbstractContainerMenu;



public class InterfaceMenu extends AbstractContainerMenu {



    public InterfaceMenu(
            int id,
            Inventory inventory,
            FriendlyByteBuf data
    ){

        super(
    ModMenuTypes.INTERFACE_MENU.get(),
    id
);

    }



    @Override
    public boolean stillValid(Player player){

        return true;

    }
    @Override
public ItemStack quickMoveStack(Player player, int index) {
    return ItemStack.EMPTY;
}

}
