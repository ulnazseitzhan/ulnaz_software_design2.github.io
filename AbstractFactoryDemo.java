interface Engine {
    void design();
}

interface Wheel {
    void manufacture();
}

class ElectricEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing Electric Engine");
    }
}

class ElectricWheel implements Wheel {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Electric Car Wheel");
    }
}

class GasolineEngine implements Engine {
    @Override
    public void design() {
        System.out.println("Designing Gasoline Engine");
    }
}

class GasolineWheel implements Wheel {
    @Override
    public void manufacture() {
        System.out.println("Manufacturing Gasoline Car Wheel");
    }
}

interface CarFactory {
    Engine createEngine();
    Wheel createWheel();
}

class ElectricCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }
    @Override
    public Wheel createWheel() {
        return new ElectricWheel();
    }
}

class GasolineCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new GasolineEngine();
    }
    @Override
    public Wheel createWheel() {
        return new GasolineWheel();
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CarFactory factory = new ElectricCarFactory();
        Engine eEngine = factory.createEngine();
        Wheel eWheel = factory.createWheel();
        eEngine.design();
        eWheel.manufacture();

        factory = new GasolineCarFactory();
        Engine gEngine = factory.createEngine();
        Wheel gWheel = factory.createWheel();
        gEngine.design();
        gWheel.manufacture();
    }
}
