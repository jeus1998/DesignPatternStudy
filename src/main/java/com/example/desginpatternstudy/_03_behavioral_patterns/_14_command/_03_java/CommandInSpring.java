package com.example.desginpatternstudy._03_behavioral_patterns._14_command._03_java;

import com.example.desginpatternstudy._03_behavioral_patterns._14_command._02_after.Command;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.time.LocalDateTime;
import java.util.*;

public class CommandInSpring {
    private DataSource dataSource;
    public CommandInSpring(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void add(Command command){
        SimpleJdbcInsert insert = new SimpleJdbcInsert(dataSource)
                .withTableName("command")
                .usingGeneratedKeyColumns("id");
        Map<String, Object> data = new HashMap<>();
        data.put("name", command.getClass().getSimpleName());
        data.put("when", LocalDateTime.now());
        insert.execute(data);
    }
}
