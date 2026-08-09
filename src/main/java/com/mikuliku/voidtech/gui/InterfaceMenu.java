package com.mikuliku.voidtech.gui;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

public class InterfaceMenu extends AbstractContainerMenu {


    public InterfaceMenu(int id, Inventory inventory, FriendlyByteBuf data) {
        super(null, id);
    }


    @Override
    public boolean stillValid(net.minecraft.world.entity.player.Player player) {
        return true;
    }
}
