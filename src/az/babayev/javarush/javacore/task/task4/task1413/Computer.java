package az.babayev.javarush.javacore.task.task4.task1413;

public class Computer {
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
