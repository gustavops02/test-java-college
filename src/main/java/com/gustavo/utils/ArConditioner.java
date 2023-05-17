package com.gustavo.utils;

public class ArConditioner {
    private int seriesNumber;
    private int BTUCapacity;
    private boolean hotAir;

    public ArConditioner(int seriesNumber, int BTUCapacity, boolean hotAir) {
        this.seriesNumber = seriesNumber;
        this.BTUCapacity = BTUCapacity;
        this.hotAir = hotAir;
    }

    public int getSeriesNumber() {
        return seriesNumber;
    }

    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public int getBTUCapacity() {
        return BTUCapacity;
    }

    public void setBTUCapacity(int BTUCapacity) {
        this.BTUCapacity = BTUCapacity;
    }

    public boolean isHotAir() {
        return hotAir;
    }

    public void setHotAir(boolean hotAir) {
        this.hotAir = hotAir;
    }
}