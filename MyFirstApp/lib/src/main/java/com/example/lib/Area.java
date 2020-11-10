//1) Write a java program for abstract class to find areas of different shapes.

package com.example.lib;

abstract class Area {
    abstract void findTriangle(double b, double h);
    abstract void findRectangle(double l, double b);
    abstract void findSquare(double s);
    abstract void findCircle(double r);
}