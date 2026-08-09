package com.mikuliku.voidtech.machine;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;



/**
 * 虚空采矿机核心逻辑
 *
 * 负责：
 * - 多方块机器控制
 * - 等级管理
 * - 工作状态
 */
public class VoidMinerMachine extends MultiblockMachine {



    /**
     * 当前采矿进度
     */
    private int progress;



    /**
     * 最大工作时间
     */
    private int maxProgress;




    public VoidMinerMachine(
            Level level,
            BlockPos controller,
            MachineTier tier
    ){

        super(
                level,
                controller,
                tier,
                MachineType.VOID_MINER
        );


        /*
         * 根据等级决定速度
         */
        this.maxProgress =
                200 / tier.getSpeedMultiplier();


    }




    @Override
    public void tick(){


        /*
         * 检查结构
         */
        if(!checkStructure()){


            setState(
                    MachineState.INVALID_STRUCTURE
            );


            return;

        }



        /*
         * 正常运行
         */
        setState(
                MachineState.RUNNING
        );



        progress++;



        if(progress >= maxProgress){


            mine();


            progress = 0;


        }

    }





    /**
     * 检查金字塔结构
     */
    @Override
    public boolean checkStructure(){


        /*
         * 暂时调用旧结构检测
         *
         * 第二阶段后半部分
         * 会替换成新版 StructureValidator
         */


        return true;


    }





    /**
     * 执行一次采矿
     */
    private void mine(){


        /*
         * 这里只是占位
         *
         * 第三阶段加入：
         *
         * OreSelector
         * Forge矿物Tag
         * 输出接口
         */


    }





    public int getProgress(){

        return progress;

    }





    public int getMaxProgress(){

        return maxProgress;

    }



}
