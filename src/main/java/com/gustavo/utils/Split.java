package com.gustavo.utils;

public class Split extends ArConditioner{

        private String color;
        private String voltage;
        private boolean remote;

        public Split(int serialNumber, int BTUCapacity, boolean hotAir, String color, String voltage, boolean remote) {
            super(serialNumber, BTUCapacity, hotAir);
            this.color= color;
            this.voltage = voltage;
            this.remote = remote;
        }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public boolean isRemote() {
        return remote;
    }

    public void setRemote(boolean remote) {
        this.remote = remote;
    }
}
