package com.ling5821.java.design.pattern.adapter;

/**
 * @author lsj
 * @date 2021/6/9 14:29
 * Adapter 适配器
 * 通过继承适配者(PhysicalRocket)，并实现目标类接口的方式进行适配(类适配模式)
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
