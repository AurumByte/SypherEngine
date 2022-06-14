package dev.aurumbyte.sypherengine.examples.inputs;

import dev.aurumbyte.sypherengine.core.GameManager;
import dev.aurumbyte.sypherengine.core.SypherEngine;

public class KeyboardInput extends GameManager {
    @Override
    public void init(SypherEngine engine) {

    }

    @Override
    public void update(float deltaTime) {

    }

    @Override
    public void render(SypherEngine engine) {

    }

    public static void main(String[] args){
        SypherEngine.init(new KeyboardInput());
        SypherEngine.run();
    }
}
