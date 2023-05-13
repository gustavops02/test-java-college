package com.gustavo.utils;

public class Split extends ArConditioner{

        private String color;
        private String voltage;
        private boolean remote;

        public Split(int numeroDeSerie, int capacidadeBTU, boolean arQuente, String color, String voltage, boolean remote) {
            super(numeroDeSerie, capacidadeBTU, arQuente);
            this.color= color;
            this.voltage = voltage;
            this.remote = remote;
        }
}
