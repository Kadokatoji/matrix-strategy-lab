package com.example;

public class FileHelper {
    public static String buildReportPath(String dir, String fileName) {
        return dir + "\\" + fileName;   // hardcode kiểu Windows
    }
}