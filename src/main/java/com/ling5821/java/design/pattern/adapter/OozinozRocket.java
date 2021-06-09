package com.ling5821.java.design.pattern.adapter;

/**
 * @author lsj
 * @date 2021/6/9 14:29
 */

public class OozinozRocket extends PhysicalRocket implements RocketSim {
    private double time;

    public OozinozRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        super(burnArea, burnRate, fuelMass, totalMass);
    }

    @Override
    public double getMass() {
        return super.getMass(time);
    }

    @Override
    public double getThrust() {
        return super.getThrust(time);
    }

    @Override
    public void setSimTime(double time) {
        this.time = time;
    }
}
