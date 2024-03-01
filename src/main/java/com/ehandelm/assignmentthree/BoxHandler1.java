package com.example.asgn3;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

/**
 *
 * Handler class for first column of boxes (i.e. boxes for 0<x<30 and 60<x<90)
 * Miro Haapalainen, Saylor Benes
 */

public class BoxHandler1 extends BoxHandler {

    private Rectangle rect1;
    private Rectangle rect2;

    /**
     * On class instantiation, instantiate rectangle backends.
     */
    public BoxHandler1() {
        this.rect1 = new Rectangle();
        this.rect1.setWidth(5);
        this.rect1.setHeight(5);
        this.rect2 = new Rectangle();
        this.rect2.setWidth(5);
        this.rect2.setHeight(5);
    }

    @Override
    public void expandBox1() {
        this.rect1.setWidth(this.rect1.getWidth()*1.5);
        this.rect1.setWidth(this.rect1.getHeight()*1.5);
    }
    @Override
    public void expandBox2() {
        this.rect2.setWidth(this.rect2.getWidth()*1.5);
        this.rect2.setWidth(this.rect2.getHeight()*1.5);
    }

    @Override
    public void handle(int size) {
        if (size <= 30) {
            expandBox1();
        } else if (size < 90 && size >= 60) {
            expandBox2();
        }
    }

    public Rectangle getRect1() {
        return rect1;
    }

    public Rectangle getRect2() {
        return rect2;
    }
}
