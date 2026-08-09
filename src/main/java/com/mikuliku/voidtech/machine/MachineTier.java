package com.mikuliku.voidtech.machine;


public enum MachineTier {


    TIER_1(
            1,
            "Void Miner I",
            100000,
            1,
            1,
            2,
            "voidtech:void_frame"
    ),


    TIER_2(
            2,
            "Void Miner II",
            500000,
            2,
            2,
            3,
            "voidtech:reinforced_void_frame"
    ),


    TIER_3(
            3,
            "Void Miner III",
            2500000,
            4,
            3,
            4,
            "voidtech:advanced_void_frame"
    ),


    TIER_4(
            4,
            "Void Miner IV",
            10000000,
            8,
            5,
            5,
            "voidtech:quantum_void_frame"
    ),


    TIER_5(
            5,
            "Void Miner V",
            50000000,
            15,
            8,
            6,
            "voidtech:stellar_void_frame"
    ),


    TIER_6(
            6,
            "Void Miner VI",
            250000000,
            30,
            12,
            8,
            "voidtech:infinity_void_frame"
    );


    /**
     * 等级
     */
    private final int level;


    /**
     * 显示名称
     */
    private final String displayName;


    /**
     * 最大储能
     */
    private final int energyCapacity;


    /**
     * 产量倍率
     */
    private final int outputMultiplier;


    /**
     * 速度倍率
     */
    private final int speedMultiplier;


    /**
     * 升级槽数量
     */
    private final int upgradeSlots;


    /**
     * 框架材料
     */
    private final String frameMaterial;



    MachineTier(
            int level,
            String displayName,
            int energyCapacity,
            int outputMultiplier,
            int speedMultiplier,
            int upgradeSlots,
            String frameMaterial
    ){

        this.level = level;
        this.displayName = displayName;
        this.energyCapacity = energyCapacity;
        this.outputMultiplier = outputMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.upgradeSlots = upgradeSlots;
        this.frameMaterial = frameMaterial;

    }



    public int getLevel(){

        return level;

    }



    public String getDisplayName(){

        return displayName;

    }



    public int getEnergyCapacity(){

        return energyCapacity;

    }



    public int getOutputMultiplier(){

        return outputMultiplier;

    }



    public int getSpeedMultiplier(){

        return speedMultiplier;

    }



    public int getUpgradeSlots(){

        return upgradeSlots;

    }



    public String getFrameMaterial(){

        return frameMaterial;

    }



    public static MachineTier fromLevel(int level){


        for(MachineTier tier : values()){


            if(tier.level == level){

                return tier;

            }

        }


        return TIER_1;

    }

}
