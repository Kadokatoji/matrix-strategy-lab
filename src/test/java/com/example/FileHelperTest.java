package com.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FileHelperTest {
    @Test
    void shouldBuildPathWithSystemSeparator() {
        String path = FileHelper.buildReportPath("data", "report.txt");
        assertEquals("data" + File.separator + "report.txt", path);
    }
}