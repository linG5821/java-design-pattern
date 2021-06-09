package com.ling5821.java.design.pattern.adapter;

import javax.swing.event.MouseInputListener;
import java.awt.event.*;

/**
 * @author lsj
 * @date 2021/6/9 14:22
 */
public class PhysicalRocket {
    private double burnArea;
    private double burnRate;
    private double fuelMass;
    private double totalMass;

    public PhysicalRocket(double burnArea, double burnRate, double fuelMass, double totalMass) {
        this.burnArea = burnArea;
        this.burnRate = burnRate;
        this.fuelMass = fuelMass;
        this.totalMass = totalMass;
    }

    public double getBurnTime() {
        // do something
        return 0;
    }

    public double getMass(double value) {
        // do something
        return 0;
    }

    public double getThrust(double value) {
        // do something
        return 0;
    }
}
