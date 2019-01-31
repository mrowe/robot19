package com.mojain.robot19;

import java.util.HashMap;
import java.util.Map;

public class Parser {

    private static final Map<String, Command> COMMANDS = new HashMap<>() {{
        put("MOVE", new MoveCommand());
        put("LEFT", new LeftCommand());
        put("RIGHT", new RightCommand());
        put("REPORT", new ReportCommand());
    }};

    public Command parse(String input) {
        if (COMMANDS.containsKey(input)) {
            return COMMANDS.get(input);
        }
        return robot -> robot;
    }
}
