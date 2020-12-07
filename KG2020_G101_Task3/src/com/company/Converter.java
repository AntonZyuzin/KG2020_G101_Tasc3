package com.company;

import com.company.point.RealTimePoint;
import com.company.point.ScreenPoint;

public class Converter {
    private double xR, yR, wR, hR;
    private int wS, hS;

    public Converter(double xR, double yR, double wR, double hR, int wS, int hS) {
        this.xR = xR;
        this.yR = yR;
        this.wR = wR;
        this.hR = hR;
        this.wS = wS;
        this.hS = hS;
    }

    public ScreenPoint r2s(RealTimePoint p) {
        double x = ((p.getX() - xR) * wS / wR);
        double y = ((yR - p.getY()) * hS / hR);
        return new ScreenPoint((int) x, (int) y);
    }

    public RealTimePoint s2r(ScreenPoint p) {
        double x = p.getX() * wR / wS + xR;
        double y = yR - p.getY() * hR / hS;
        return new RealTimePoint(x, y);
    }

    public double getxR() {
        return xR;
    }

    public void setxR(double xR) {
        this.xR = xR;
    }

    public double getyR() {
        return yR;
    }

    public void setyR(double yR) {
        this.yR = yR;
    }

    public double getwR() {
        return wR;
    }

    public void setwR(double wR) {
        this.wR = wR;
    }

    public double gethR() {
        return hR;
    }

    public void sethR(double hR) {
        this.hR = hR;
    }

    public void setwS(int wS) {
        this.wS = wS;
    }

    public void sethS(int hS) {
        this.hS = hS;
    }


}
