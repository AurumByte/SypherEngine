package dev.aurumbyte.sypherengine.physics.primitives;

import dev.aurumbyte.sypherengine.math.Vector2;
import dev.aurumbyte.sypherengine.physics.rigidbody.RigidBody2D;

public class AABB {
    private Vector2 size = new Vector2();
    private Vector2 halfSize;
    private RigidBody2D rigidBody = null;

    public AABB(){
        this.halfSize = new Vector2(size).multiply(0.5f);
    }

    public AABB(Vector2 min, Vector2 max){
        this.size = new Vector2(max).subtract(min);
        this.halfSize = new Vector2(size).multiply(0.5f);
    }

    public Vector2 getMin() {
        return new Vector2(this.rigidBody.getPosition()).subtract(this.halfSize);
    }

    public Vector2 getMax() {
        return new Vector2(this.rigidBody.getPosition()).add(this.halfSize);
    }
}
