package dev.aurumbyte.sypherengine;

import dev.aurumbyte.sypherengine.config.EngineConfig;
import dev.aurumbyte.sypherengine.core.GameManager;
import dev.aurumbyte.sypherengine.core.SypherEngine;

public class GameApplication {
    public static void run(GameManager gameManager){
        SypherEngine.init(gameManager);
        SypherEngine.run();
    }

    public static void run(GameManager gameManager, String title){
        SypherEngine.init(gameManager, title);
        SypherEngine.run();
    }

    public static void run(GameManager gameManager, EngineConfig config){
        SypherEngine.init(gameManager, config);
        SypherEngine.run();
    }
}
