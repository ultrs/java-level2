package com.mentoring.level2.practiceOOP.firstPractice.figure;

public class Rectangle {

    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public double diagonalLength() {
        return leftTop.distance(rightBottom);
    }

    public int rectangleArea() {
        return (leftTop.getY() - rightBottom.getY())*(rightBottom.getX() - leftTop.getX());
    }

}
