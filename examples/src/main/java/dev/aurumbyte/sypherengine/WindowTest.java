package dev.aurumbyte.sypherengine;

import dev.aurumbyte.sypherengine.core.GameManager;
import dev.aurumbyte.sypherengine.core.SypherEngine;
import dev.aurumbyte.sypherengine.core.graphics.Renderer;

public class WindowTest extends GameManager {
    @Override
    public void init(SypherEngine engine) {

    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(Renderer renderer) {

    }

    public static void main(String[] args){
        SypherEngine.init(new WindowTest());
        SypherEngine.run();
    }
}
