package com.mikuliku.voidtech.machine;



import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;



public abstract class MultiblockMachine {



    /**
     * 当前等级
     */
    protected MachineTier tier;



    /**
     * 当前状态
     */
    protected MachineState state =
            MachineState.IDLE;



    /**
     * 机器类型
     */
    protected MachineType type;



    /**
     * 控制核心位置
     */
    protected BlockPos controller;



    /**
     * 世界
     */
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




    /**
     * 每tick运行
     */
    public abstract void tick();




    /**
     * 检测多方块结构
     */
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





    public BlockPos getController(){

        return controller;

    }





    protected void setState(
            MachineState state
    ){

        this.state = state;

    }


}
