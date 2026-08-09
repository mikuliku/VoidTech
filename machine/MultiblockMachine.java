package com.mikuliku.voidtech.machine;



import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;



public abstract class MultiblockMachine {



    protected MachineTier tier;


    protected MachineState state =
            MachineState.IDLE;


    protected MachineType type;



    protected BlockPos controller;



    protected Level level;



    public MultiblockMachine(
            Level level,
            BlockPos controller,
            MachineTier tier,
            MachineType type
    ){

        this.level = level;

        this.controller = controller;

        this.tier = tier;

        this.type = type;

    }




    public abstract void tick();



    public abstract boolean checkStructure();




    public MachineState getState(){

        return state;

    }



    public MachineTier getTier(){

        return tier;

    }



    public MachineType getType(){

        return type;

    }


    protected void setState(
            MachineState state
    ){

        this.state = state;

    }


}
