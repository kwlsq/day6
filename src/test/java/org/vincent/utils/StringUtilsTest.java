package org.vincent.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void reverse() {
        assertEquals("gnalam", StringUtils.reverse("malang"));
        assertEquals("sam", StringUtils.reverse("mas"));
    }
}