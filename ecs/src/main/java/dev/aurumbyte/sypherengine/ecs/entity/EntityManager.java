package dev.aurumbyte.sypherengine.ecs.entity;

import java.util.HashMap;
import java.util.Map;

public class EntityManager {

    private int maxEntities = 250;
    static private Map<Class<?>, String> entityTypes = new HashMap<>();
    static private Map<String, Integer> entityTypePool = new HashMap<>();

    /*
    public <T extends Entity> Entity createEntity(T entity){
        entityTypes.put()
    }
     */
}
