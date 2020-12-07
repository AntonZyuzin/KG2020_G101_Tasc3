package com.company.Triangle;

import com.company.point.RealTimePoint;

import java.util.ArrayList;
import java.util.List;

public class Figure {

    private List<RealTimePoint> list = new ArrayList<>();

    public Figure() {
    }

    public Figure(List<RealTimePoint> list) {
        this.list = list;
    }

    public List<RealTimePoint> getList() {
        return list;
    }

    public void addPoint(RealTimePoint p) {
        list.add(p);
    }

    public int getSize() {
        return list.size();
    }
}
