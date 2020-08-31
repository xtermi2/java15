package com.github.xtermi2.java15.jep378textblocks;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.*;

class TextBlockTest {
    @Test
    void create() {
        assertThat(new TextBlock().create(LocalDate.of(2020, 3, 17)))
                .isEqualTo("{\n" +
                        "  \"id\": 12345\n" +
                        "  \"name\": \"foo\"\n" +
                        "  \"date\": \"2020-03-17\"\n" +
                        "}");
    }
}