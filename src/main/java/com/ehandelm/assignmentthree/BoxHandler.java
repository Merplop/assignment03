package com.example.asgn3;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * Abstract class which provides pattern for Box Handler subclasses
 * Miro Haapalainen, Saylor Benes
 */

public abstract class BoxHandler {
    private AnchorPane graphVisual;
    private BoxHandler next;

    public BoxHandler() {
    }

    /**
     * Method which handles the size of the randomly generated value
     * @param size
     */

    public abstract void handle(int size);

    /**
     * Method which expands first box
     */

    public abstract void expandBox1();

    /**
     * Method which expands second box
     */

    public abstract void expandBox2();

    /**
     * Set next handler in chain
     * @param b next BoxHandler in chain of responsibility
     */

    public void setNext(BoxHandler b) {
        this.next = b;
    }

    public BoxHandler getNext() {
        return next;
    }
}
