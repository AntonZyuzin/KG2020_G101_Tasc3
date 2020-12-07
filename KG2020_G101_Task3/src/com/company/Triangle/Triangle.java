package com.company.Triangle;

import com.company.point.RealTimePoint;

public class Triangle extends Figure{


    public Triangle() {
    }

    @Override
    public void addPoint(RealTimePoint p) {
        if(this.getSize() < 3) {
            super.addPoint(p);
        }
    }
}
