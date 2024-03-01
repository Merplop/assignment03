package com.example.asgn3;

import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class BoxHandler2 extends BoxHandler {
    Rectangle rect1;
    Rectangle rect2;
    public BoxHandler2() {
        this.rect1 = new Rectangle();
        this.rect1.setWidth(5);
        this.rect1.setHeight(5);
        this.rect2 = new Rectangle();
        this.rect2.setWidth(5);
        this.rect2.setHeight(5);
    }

    public void expandBox1() {
        this.rect1.setWidth(this.rect1.getWidth()*1.5);
        this.rect1.setWidth(this.rect1.getHeight()*1.5);
    }

    public void expandBox2() {
        this.rect2.setWidth(this.rect2.getWidth()*1.5);
        this.rect2.setWidth(this.rect2.getHeight()*1.5);
    }

    @Override
    public void handle(int size) {
        if (size > 30 && size <= 60) {
            expandBox1();
        } else if (size > 90) {
            expandBox2();
        }
    }
}
