package org.aplas.basicapp;

public class Weight {
    private double gram;

    public  Weight() {
        gram=0;
    }
    public void setGram(double val) {
        gram=val;
    }
    public void setOunce(double val) {
        gram=val*28.3495231;
    }
    public void setPound(double val) {
        gram=val*453.59237;
    }
    public  double getGram() {
        return gram;
    }
    public  double getOunce() {
        return gram/28.3495231;
    }

    public double getPound() {
        return gram/453.59237;
    }

    public double convert (String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("Grm")) {
            setGram(value);
        } else if (oriUnit.equals("Pnd")) {
            setPound(value);
        } else {
            setOunce(value);
        }
        if (convUnit.equals("Grm")) {
            return getGram();
        } else if (convUnit.equals("Pnd")) {
            return getPound();
        } else {
            return getOunce();
        }
    }
}