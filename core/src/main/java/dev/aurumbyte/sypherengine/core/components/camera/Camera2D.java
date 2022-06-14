/* (C)2022 AurumByte */
package dev.aurumbyte.sypherengine.core.components.camera;

import dev.aurumbyte.sypherengine.core.ecs.GameObject;
import dev.aurumbyte.sypherengine.util.math.Vector2;
import javafx.scene.ParallelCamera;
import javafx.scene.transform.Translate;

/**
 * Camera class for 2D camera transforms, currently still experimental
 * @author AurumByte
 * @since v0.3.2
 */
public class Camera2D {
    // still wip

    /**
     * The position of the camera
     */
    Vector2 cameraPosition;

    /**
     * The parent entity that the camera might be attached to
     */
    GameObject parent;

    /**
     * The base camera class of JavaFX, that we're wrapping around to create the camera
     */
    ParallelCamera camera = new ParallelCamera();

    /**
     * <p>Creating a new camera attached to an entity</p>
     * @param parent The entity to which the camera will be attached to
     * @since 0.3.2
     */
    public Camera2D(GameObject parent) {
        this.parent = parent;
        this.cameraPosition = parent.getPosition();

        camera.setNearClip(0.1);
        camera.setFarClip(2000);

        camera.setTranslateX(parent.getPosition().xPos);
        camera.setTranslateY(parent.getPosition().yPos);
    }

    /**
     * <p>Creating a new camera, not attched to any entity</p>
     * @since 0.3.2
     */
    public Camera2D() {
        this.cameraPosition = new Vector2();

        camera.setNearClip(0.1);
        camera.setFarClip(2000);

        camera.setTranslateX(0);
        camera.setTranslateY(0);
    }

    /**
     * <p>A method to attach the camera to an entity</p>
     * @param gameObject the Entity to which the camera will be attched to
     * @since 0.3.2
     */
    public void attachToEntity(GameObject gameObject) {
        this.parent = gameObject;
    }

    /**
     * <p>A method to move the camera to a specific location.</p>
     * @param xPos the new x position of the camera
     * @param yPos the new y position of the camera
     * @since 0.3.2
     */
    public void setCameraPos(float xPos, float yPos) {
        Translate translate = new Translate();
        translate.setX(xPos);
        translate.setY(yPos);
        translate.setZ(0);

        camera.getTransforms().add(translate);
    }

    /**
     * <p>A method to move the camera to a specific location.</p>
     * @param cameraPos the new x and y position of the camera, using the Vector2 class
     * @since 0.3.2
     */
    public void setCameraPos(Vector2 cameraPos) {
        Translate translate = new Translate();
        translate.setX(cameraPos.xPos);
        translate.setY(cameraPos.yPos);
        translate.setZ(0);

        camera.getTransforms().add(translate);
    }

    /**
     * <p>Getting the base camera to attach to the scene.</p>
     * @since 0.3.2
     */
    public ParallelCamera getParallelCamera() {
        return camera;
    }

    /**
     * <p>Updating the camera's position.</p>
     * @since 0.3.2
     */
    public void update() {
        Translate translate = new Translate();
        translate.setX(cameraPosition.xPos);
        translate.setY(cameraPosition.yPos);
        translate.setZ(0);

        camera.getTransforms().add(translate);
    }
}
