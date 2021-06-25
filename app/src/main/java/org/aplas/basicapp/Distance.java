package org.aplas.basicapp;

public class Distance {
    private double meter;

    public Distance() {
        meter=0;
    }

    public void setMeter(double val) {
        meter=val;
    }

    public void setInch(double val) {
        meter=val*0.0254;
    }

    public void setMile(double val) {
        meter=val*1609.344498;
    }

    public void setFoot(double val) {
        meter=val*0.3048;
    }

    public double getMeter() {
        return meter;
    }

    public double getInch() {
        return meter*39.3701;
    }

    public double getMile() {
        return meter*0.000621371;
    }

    public double getFoot() {
        return meter*3.28084;
    }

    protected double convert (String oriUnit, String convUnit, double value) {
        if (oriUnit.equals("Mtr")) {
            setMeter(value);
        } else if (oriUnit.equals("Inc")) {
            setInch(value);
        } else if (oriUnit.equals("Mil")) {
            setMile(value);
        } else {
            setFoot(value);
        }
        if (convUnit.equals("Mtr")) {
            return getMeter();
        } else if (convUnit.equals("Inc")) {
            return getInch();
        } else if (convUnit.equals("Mil")) {
            return getMile();
        } else {
            return getFoot();
        }
    }
}