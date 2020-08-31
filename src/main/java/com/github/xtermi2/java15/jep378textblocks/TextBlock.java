package com.github.xtermi2.java15.jep378textblocks;

import java.time.LocalDate;

public class TextBlock {

    private String jsonTemplate =
            """
            {
              "id": 12345
              "name": "foo"
              "date": "%s"
            }""";

    public String create(LocalDate date) {
        return String.format(jsonTemplate, date.toString());
    }
}
