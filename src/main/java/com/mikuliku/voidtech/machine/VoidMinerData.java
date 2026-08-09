package com.mikuliku.voidtech.machine;


public class VoidMinerData {


    private MachineTier tier;


    private int speedUpgrade;


    private int yieldUpgrade;


    private int precisionUpgrade;



    public VoidMinerData(){

        this.tier = MachineTier.TIER_1;

    }



    public MachineTier getTier(){

        return tier;

    }



    public void setTier(MachineTier tier){

        this.tier = tier;

    }



    public int getSpeedUpgrade(){

        return speedUpgrade;

    }



    public void addSpeedUpgrade(){

        speedUpgrade++;

    }



    public int getYieldUpgrade(){

        return yieldUpgrade;

    }



    public void addYieldUpgrade(){

        yieldUpgrade++;

    }



    public int getPrecisionUpgrade(){

        return precisionUpgrade;

    }



    public void addPrecisionUpgrade(){

        precisionUpgrade++;

    }


}
