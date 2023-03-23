package com.mycompany.projet_prog2;

/**
 *
 * @author nazihcheribi
 */
public class RouteSegment {
    private RoutePoint point1;
    private RoutePoint point2;

    public RouteSegment(RoutePoint point1, RoutePoint point2){
        this.point1 = point1;
        this.point2 = point2;
    }        

    public RoutePoint getPoint1() {
        return point1;
    }

    public RoutePoint getPoint2() {
        return point2;
    }
    
}
