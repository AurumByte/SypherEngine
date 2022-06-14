package dev.aurumbyte.sypherengine.physics.rigidbody;

import dev.aurumbyte.sypherengine.util.math.Vector2;

public class RigidBody2D {
    private Vector2 position = new Vector2();
    private float rotation = 0.0f;

    /*
    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(SypherEngine engine) {

    }

     */

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }
}