package com.mikuliku.voidtech.capability;


import net.minecraftforge.energy.EnergyStorage;



public class VoidEnergyStorage extends EnergyStorage {


    public VoidEnergyStorage(int capacity){

        super(
                capacity,
                capacity / 20,
                capacity / 20
        );

    }


}
