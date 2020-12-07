package com.company;

import com.company.point.RealTimePoint;

public class Line {
    private RealTimePoint p1, p2;

    public Line(RealTimePoint p1, RealTimePoint p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(double x1, double y1, double x2, double y2) {

        this(new RealTimePoint(x1, y1), new RealTimePoint(x2, y2));
    }

    public RealTimePoint getP1() {
        return p1;
    }

    public RealTimePoint getP2() {
        return p2;
    }

    public void setP2(RealTimePoint p2) {
        this.p2 = p2;
    }

}
