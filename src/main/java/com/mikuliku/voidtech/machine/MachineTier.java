package com.mikuliku.voidtech.machine;


public enum MachineTier {

    TIER_1(
            "虚空采矿机 I",
            100000,
            1
    ),

    TIER_2(
            "虚空采矿机 II",
            500000,
            2
    ),

    TIER_3(
            "虚空采矿机 III",
            2000000,
            3
    ),

    TIER_4(
            "虚空采矿机 IV",
            10000000,
            4
    ),

    TIER_5(
            "虚空采矿机 V",
            50000000,
            5
    ),

    TIER_6(
            "虚空采矿机 VI",
            250000000,
            6
    );


    private final String name;

    private final int energyCapacity;

    private final int level;


    MachineTier(
            String name,
            int energyCapacity,
            int level
    ){

        this.name = name;
        this.energyCapacity = energyCapacity;
        this.level = level;

    }


    public String getName(){

        return name;

    }


    public int getEnergyCapacity(){

        return energyCapacity;

    }


    public int getLevel(){

        return level;

    }


}
