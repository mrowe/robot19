package com.mojain.robot19;

public enum Direction {
    NORTH, EAST, SOUTH, WEST;

    public Direction right() {
        return values()[((ordinal() + 1) % values().length)];
    }

    public Direction left() {
        return right().right().right(); // yolo
    }
}
