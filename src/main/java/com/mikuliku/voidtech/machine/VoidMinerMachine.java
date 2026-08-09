package com.mikuliku.voidtech.machine;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;



public class VoidMinerMachine {


    private final BlockPos position;


    private MachineTier tier;


    private boolean active;



    public VoidMinerMachine(
            BlockPos position,
            MachineTier tier
    ){

        this.position = position;
        this.tier = tier;

    }



    public void tick(Level level){


        if(
                VoidStructure.checkStructure(
                        level,
                        position,
                        tier
                )
        ){

            active = true;

        }

        else{

            active = false;

        }


    }



    public boolean isActive(){

        return active;

    }



    public MachineTier getTier(){

        return tier;

    }



    public BlockPos getPosition(){

        return position;

    }



}
