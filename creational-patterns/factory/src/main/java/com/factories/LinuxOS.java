package com.factories;

public class LinuxOS extends OS{
    public LinuxOS(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Changing directory in Linux");

    }

    @Override
    public void removeDir() {
        System.out.println("Removing directory in Linux");

    }
}
