package dev.aurumbyte.sypherengine.physics.primitives;

import dev.aurumbyte.sypherengine.math.Vector2;

public class Circle {
    private float radius = 1.0f;
    private Vector2 center = new Vector2();

    public Circle(Vector2 center, float radius){
        this.radius = radius;
        this.center = center;
    }

    public float getRadius() {
        return radius;
    }

    public Vector2 getCenter() {
        return center;
    }
}
