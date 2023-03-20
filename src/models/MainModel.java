package models;

public class MainModel {
    public double calcRadius(double side,double alpha){
        double rad=alpha*Math.PI/180;
        return side*Math.sin(rad)/2;
    }
}
