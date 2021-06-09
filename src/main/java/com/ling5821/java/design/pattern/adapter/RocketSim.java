package com.ling5821.java.design.pattern.adapter;

/**
 * @author lsj
 * @date 2021/6/9 14:21
 */
public interface RocketSim {
    double getMass();

    double getThrust();

    void setSimTime(double time);
}
