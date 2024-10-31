package com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import java.util.*;

@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class OKGoogle {
    private Stack<Command> commands = new Stack<>();
    public void call(Command command){
        command.execute();
        commands.push(command);
    }
    public void undo(){
        if(!commands.isEmpty()){
            Command command = commands.pop();
            command.undo();
        }
    }
}
