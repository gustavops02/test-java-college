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
}
