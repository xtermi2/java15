package com.github.xtermi2.java15.jep360sealedclasses;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OptionTest {
    @Test
    void of_null_is_None() {
        assertThat(Option.of(null).getClass().getSimpleName())
                .isEqualTo("None");
    }

    @Test
    void of_nonNull_is_Some() {
        assertThat(Option.of("null").getClass().getSimpleName())
                .isEqualTo("Some");
    }

    @Test
    void none_is_empty() {
        assertThat(Option.of(null).isEmpty())
                .isTrue();
        assertThat(Option.of(null).isPresent())
                .isFalse();
    }

    @Test
    void some_is_present() {
        assertThat(Option.of("null").isPresent())
                .isTrue();
        assertThat(Option.of("null").isEmpty())
                .isFalse();
    }

    @Test
    void reflection() {
        assertThat(Option.class.isSealed())
                .isTrue();
        assertThat(Option.of("null").getClass().isSealed())
                .isFalse();
    }
}