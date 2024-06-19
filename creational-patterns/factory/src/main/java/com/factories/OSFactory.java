package com.factories;

public class OSFactory {
    private OSFactory(){};
    public static OS getInstance(String type, String version, String architecture){
        switch (type){
            case "WINDOWS":
                return new WindowsOS(version, architecture);
            case "LINUX":
                return new LinuxOS(version, architecture);
            default:
                throw new IllegalArgumentException("OS Not Supported");
        }
    }
}
