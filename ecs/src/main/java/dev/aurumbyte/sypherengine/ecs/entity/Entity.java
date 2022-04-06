package dev.aurumbyte.sypherengine.ecs.entity;

import dev.aurumbyte.sypherengine.ecs.component.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Entity {
    int entityID = 0;
    String entityTypeName;
    String tag;

    boolean isAlive = false;

    List<Component> components = new ArrayList<>();

    public boolean isAlive() {
        return isAlive;
    }
}
