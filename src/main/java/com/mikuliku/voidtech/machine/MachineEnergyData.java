package com.mikuliku.voidtech.machine;



public class MachineEnergyData {


    public static int getCapacity(
            MachineTier tier
    ){


        return switch(tier){


            case TIER_1 -> 100000;

            case TIER_2 -> 500000;

            case TIER_3 -> 2000000;

            case TIER_4 -> 10000000;

            case TIER_5 -> 50000000;

            case TIER_6 -> 250000000;


        };


    }


}
