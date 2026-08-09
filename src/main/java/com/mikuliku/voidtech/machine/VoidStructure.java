package com.mikuliku.voidtech.machine;


import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;


public class VoidStructure {


    /**
     * 检测虚空采矿机金字塔结构
     *
     * @param level 世界
     * @param core 核心位置
     * @param tier 等级
     */
    public static boolean checkStructure(
            Level level,
            BlockPos core,
            MachineTier tier
    ){


        int size = tier.getLevel() + 2;


        // 检查金字塔四周框架
        for(int y = 0; y <= size; y++){


            int radius = size - y;


            for(int x = -radius; x <= radius; x++){

                for(int z = -radius; z <= radius; z++){


                    BlockPos pos =
                            core.offset(x,y,z);



                    // 中空区域跳过
                    if(
                            x == 0 &&
                            z == 0 &&
                            y < size
                    ){

                        continue;

                    }


                    Block block =
                            level.getBlockState(pos)
                                    .getBlock();



                    if(block == net.minecraft.world.level.block.Blocks.AIR){

                        return false;

                    }

                }

            }

        }


        return true;

    }



}
