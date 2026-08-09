package com.mikuliku.voidtech.machine;


public class InterfaceTierData {


    public static int getSlotCount(MachineTier tier){


        return switch(tier){

            case TIER_1 -> 3;

            case TIER_2 -> 6;

            case TIER_3 -> 9;

            case TIER_4 -> 12;

            case TIER_5 -> 18;

            case TIER_6 -> 27;

        };

    }



    public static int getFluidCapacity(MachineTier tier){


        return switch(tier){

            case TIER_1 -> 16000;

            case TIER_2 -> 64000;

            case TIER_3 -> 256000;

            case TIER_4 -> 1000000;

            case TIER_5 -> 4000000;

            case TIER_6 -> 16000000;

        };

    }


}
