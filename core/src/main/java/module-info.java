module io.github.sypherengine.core {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports dev.aurumbyte.sypherengine.core;
    opens dev.aurumbyte.sypherengine.core to javafx.fxml;

    exports dev.aurumbyte.sypherengine.core.audio;
    opens dev.aurumbyte.sypherengine.core.audio to javafx.fxml;

    exports dev.aurumbyte.sypherengine.core.graphics;
    opens dev.aurumbyte.sypherengine.core.graphics to javafx.fxml;

    exports dev.aurumbyte.sypherengine.core.event;
    opens dev.aurumbyte.sypherengine.core.event to javafx.fxml;

    exports dev.aurumbyte.sypherengine.config;
    opens dev.aurumbyte.sypherengine.config to javafx.fxml;

    exports dev.aurumbyte.sypherengine.ecs;
    opens dev.aurumbyte.sypherengine.ecs to javafx.fxml;

    exports dev.aurumbyte.sypherengine.components;
    opens dev.aurumbyte.sypherengine.components to javafx.fxml;

    exports dev.aurumbyte.sypherengine.components.scene;
    opens dev.aurumbyte.sypherengine.components.scene to javafx.fxml;

    exports dev.aurumbyte.sypherengine.components.camera;
    opens dev.aurumbyte.sypherengine.components.camera to javafx.fxml;

    exports dev.aurumbyte.sypherengine.math;
    opens dev.aurumbyte.sypherengine.math to javafx.fxml;

    exports dev.aurumbyte.sypherengine.logging;
    opens dev.aurumbyte.sypherengine.logging to javafx.fxml;

    exports dev.aurumbyte.sypherengine.logging.logUtils;
    opens dev.aurumbyte.sypherengine.logging.logUtils to javafx.fxml;

    exports dev.aurumbyte.sypherengine.ui;
    opens dev.aurumbyte.sypherengine.ui to javafx.fxml;

    exports dev.aurumbyte.sypherengine.core.graphics.gradients;
    opens dev.aurumbyte.sypherengine.core.graphics.gradients to javafx.fxml;

    exports dev.aurumbyte.sypherengine.core.graphics.tiles;
    opens dev.aurumbyte.sypherengine.core.graphics.tiles to javafx.fxml;
}