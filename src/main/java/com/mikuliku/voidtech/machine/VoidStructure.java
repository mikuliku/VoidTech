package com.mikuliku.voidtech.machine;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;





/**
 * 虚空机器多方块结构检测
 *
 * 结构：
 *
 *        C
 *
 *      F   F
 *
 *    F       F
 *
 *  F     空    F
 *
 *FFFFFFFFFFFFF
 *
 *
 * C = Controller
 * F = Void Frame
 *
 */
public class VoidStructure {



    /**
     * 检查结果
     */
    private boolean valid;



    /**
     * 当前等级
     */
    private MachineTier tier;



    /**
     * 控制器位置
     */
    private final BlockPos controller;




    public VoidStructure(
            BlockPos controller,
            MachineTier tier
    ){

        this.controller = controller;

        this.tier = tier;

    }





    /**
     * 检测结构
     */
    public boolean check(
            Level level
    ){


        int size =
                getStructureSize();



        /*
         * 从控制器向下检测
         */
        for(int y = 0; y <= size; y++){


            int radius =
                    size - y;



            for(int x=-radius; x<=radius; x++){


                for(int z=-radius; z<=radius; z++){



                    BlockPos pos =
                            controller
                                    .offset(
                                            x,
                                            -y,
                                            z
                                    );



                    /*
                     * 中心区域必须为空
                     */
                    if(
                            x==0
                            &&
                            z==0
                            &&
                            y!=size
                    ){

                        continue;

                    }



                    /*
                     * 这里暂时只检测存在方块
                     *
                     * 下一阶段加入：
                     *
                     * Block Tag:
                     * voidtech:machine_frames
                     *
                     */


                    if(level.isEmptyBlock(pos)){


                        valid=false;

                        return false;


                    }



                }


            }


        }



        valid=true;


        return true;

    }





    /**
     * 根据等级决定金字塔大小
     */
    private int getStructureSize(){


        return switch(tier){


            case TIER_1 -> 3;


            case TIER_2 -> 4;


            case TIER_3 -> 5;


            case TIER_4 -> 6;


            case TIER_5 -> 7;


            case TIER_6 -> 8;


        };


    }





    public boolean isValid(){

        return valid;

    }





    public MachineTier getTier(){

        return tier;

    }





    public BlockPos getController(){

        return controller;

    }



}
