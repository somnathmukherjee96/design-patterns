package builder;

public class Desktop {
    private final String monitor;
    private final String keyboard;
    private final String mouse;
    private final String speaker;
    private final String ram;
    private final String processor;
    private final String motherboard;

    public Desktop(Builder builder){
        this.monitor = builder.monitor;
        this.keyboard = builder.keyboard;
        this.mouse = builder.mouse;
        this.speaker = builder.speaker;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.motherboard = builder.motherboard;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getSpeaker() {
        return speaker;
    }

    public String getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void showSpec(){
        System.out.println("Monitor --> "+getMonitor());
        System.out.println("Keyboard --> "+getKeyboard());
        System.out.println("Ram --> "+getRam());
        System.out.println("Mouse --> "+getMouse());
        System.out.println("Processor --> "+getProcessor());
        System.out.println("Motherboard --> "+getMotherboard());
        System.out.println("Speaker --> "+getSpeaker());
    }

    public static class Builder{
        private String monitor;
        private String keyboard;
        private String mouse;
        private String speaker;
        private String ram;
        private String processor;
        private String motherboard;

        public Builder setMonitor(String monitor) {
            this.monitor = monitor;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setMouse(String mouse) {
            this.mouse = mouse;
            return this;
        }

        public Builder setSpeaker(String speaker) {
            this.speaker = speaker;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setMotherboard(String motherboard) {
            this.motherboard = motherboard;
            return this;
        }

        public Desktop build(){
            return new Desktop(this);
        }
    }

}
