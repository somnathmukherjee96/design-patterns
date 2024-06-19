package com.factories;

public abstract class OS {
    private String version;
    private String architecture;

    public OS(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public abstract void changeDir();
    public abstract void removeDir();

}
