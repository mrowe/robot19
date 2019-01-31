package com.mojain.robot19;

public class PlaceCommand implements Command {
    private final int x;
    private final int y;
    private final Direction facing;

    public PlaceCommand(int x, int y, Direction facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    @Override
    public Robot invoke(Robot robot) {
        Position position = new Position(x, y);
        return new Robot(position, facing);
    }
}
