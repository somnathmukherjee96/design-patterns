package com.factories;

public class WindowsOS extends OS{
    public WindowsOS(String version, String architecture){
        super(version, architecture);
    }

    @Override
    public void changeDir() {
        System.out.println("Changing directory in Windows");
    }

    @Override
    public void removeDir() {
        System.out.println("Removing directory in Windows");

    }
}
