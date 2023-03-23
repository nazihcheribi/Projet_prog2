package com.mycompany.projet_prog2;

import com.mycompany.projet_prog2.views.MainWindow;
import java.util.ArrayList;

/**
 *
 * @author nazihcheribi
 */
public class Projet_prog2 {

    public static void main(String[] args) {
        Parking parkingC = new Parking(100,30);
        Parking parkingH = new Parking(100,50);

        RoutePoint pointA = new RoutePoint(200, 400, null);
        RoutePoint pointB = new RoutePoint(200, 350, null);
        RoutePoint pointC = new RoutePoint(400, 350, parkingC);
        RoutePoint pointD = new RoutePoint(200, 250, null);
        RoutePoint pointE = new RoutePoint(100, 250, null);
        RoutePoint pointF = new RoutePoint(350, 250, null);
        RoutePoint pointG = new RoutePoint(400, 100, null);
        RoutePoint pointH = new RoutePoint(300, 100, parkingH);
        RoutePoint pointI = new RoutePoint(300, 50, null);
        
        pointA.connect(pointB);
        pointB.connect(pointC);
        pointB.connect(pointD);
        pointE.connect(pointD);       
        pointD.connect(pointF);  
        pointF.connect(pointG);      
        pointG.connect(pointH);
        pointI.connect(pointD);

        ArrayList<RoutePoint> routePoints = new ArrayList<>();
        routePoints.add(pointA);
        routePoints.add(pointB);
        routePoints.add(pointC);
        routePoints.add(pointD);
        routePoints.add(pointE);
        routePoints.add(pointF);
        routePoints.add(pointG);
        routePoints.add(pointH);
        routePoints.add(pointI);
        
        /*RouteSegment segmentAlpha = new RouteSegment(pointA, pointB);
        RouteSegment segmentBeta = new RouteSegment(pointB, pointC);
        RouteSegment segmentGama = new RouteSegment(pointB, pointD);
        RouteSegment segmentTeta = new RouteSegment(pointE, pointD);
        RouteSegment segmentZeta = new RouteSegment(pointD, pointF);
        RouteSegment segmentDelta = new RouteSegment(pointF, pointG);
        RouteSegment segmentOmega = new RouteSegment(pointG, pointH);
        RouteSegment segmentFinal = new RouteSegment(pointD, pointI);
        
        ArrayList<RouteSegment> segmentList = new ArrayList<RouteSegment>();
        segmentList.add(segmentAlpha);
        segmentList.add(segmentBeta);
        segmentList.add(segmentDelta);
        segmentList.add(segmentGama);
        segmentList.add(segmentFinal);
        segmentList.add(segmentOmega);
        segmentList.add(segmentTeta);
        segmentList.add(segmentZeta);*/           
        
        new MainWindow(routePoints).setVisible(true);
    }
}
