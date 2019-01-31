package com.mojain.robot19;

import com.mojain.robot19.commands.*;

import java.util.HashMap;
import java.util.Map;

public class Parser {

    private static final Map<String, Command> COMMANDS = new HashMap<>() {{
        put("MOVE", new MoveCommand());
        put("LEFT", new LeftCommand());
        put("RIGHT", new RightCommand());
        put("REPORT", new ReportCommand());
    }};

    private static final String PLACE = "PLACE"; // bear with me here

    public Command parse(String input) {
        if (COMMANDS.containsKey(input)) {
            return COMMANDS.get(input);
        }
        if (input.startsWith(PLACE)) {
            String args = input.substring(PLACE.length()).trim();
            String[] parts = args.split(",", 3);
            try {
                int x = Integer.parseInt(parts[0]);
                int y = Integer.parseInt(parts[1]);
                Direction f = Direction.valueOf(parts[2]);
                return new PlaceCommand(x, y, f);
            } catch (Throwable t) {
                throw new RuntimeException(t);
            }
        }
        // default to NOOP Command
        return robot -> robot;
    }
}
