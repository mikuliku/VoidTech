package com.mikuliku.voidtech.blockentity;


import com.mikuliku.voidtech.machine.MachineTier;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;



public class VoidMinerBlockEntity extends BlockEntity {


    private MachineTier tier;


    private boolean active;



    public VoidMinerBlockEntity(
            BlockPos pos,
            BlockState state
    ){

        super(null,pos,state);

        this.tier = MachineTier.TIER_1;

    }



    public MachineTier getTier(){

        return tier;

    }



    public void setTier(MachineTier tier){

        this.tier=tier;

    }



    public boolean isActive(){

        return active;

    }



    public void setActive(boolean active){

        this.active=active;

    }


}
