package dev.aurumbyte.sypherengine.physics.rigidbody;

import dev.aurumbyte.sypherengine.math.Vector2;
import dev.aurumbyte.sypherengine.physics.primitives.Circle;

public class IntersectionDetector2D {
    // Point vs Primitive
    public static boolean pointOnLine(Vector2 point, Vector2 lineStart, Vector2 lineEnd){
        float dy = lineEnd.yPos - lineStart.yPos;
        float dx = lineEnd.xPos - lineStart.xPos;

        float slope = dy / dx;

        float yInterception = lineEnd.yPos - (slope * lineEnd.xPos);

        return point.yPos == slope * point.xPos + yInterception;
    }

    public static boolean pointInCircle(Vector2 point, Circle circle){
        Vector2 center = circle.getCenter();
        Vector2 centerToPoint = new Vector2(point).subtract(center);

        //return  < circle.getRadius() * circle.getRadius();
        return true;
    }
    // Line vs Primitive
}
