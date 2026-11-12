package com.example;

import java.nio.file.Paths;

public class FileHelper {
    public static String buildReportPath(String dir, String fileName) {
        return Paths.get(dir, fileName).toString();
    }
}