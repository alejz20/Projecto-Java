public class  Parking {
    public final int maxCapacity;
    public static final int MIN_SPOTS =1;

    private int _availableSpots;

    public Parking(int maxCapacity) {
        this.maxCapacity = maxCapacity;

        _availableSpots = maxCapacity;
    }

    public synchronized void entre(Car car){
        while (_availableSpots == 0){
            System.out.println("Car %s is waiting%n" + car);
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        _availableSpots--;
        System.out.println("Car %s is parked. Available spots %d%n" + car + _availableSpots);
    }

    public synchronized void leave(Car car){
        _availableSpots++;
        System.out.println("Car %s  left. Avilable spots %d%n" + car + _availableSpots);
        notifyAll();
    }











    static class Car extends Thread{

        private final Parking _parking;

        public Car(String name, Parking parking){
            name = name;
            _parking = parking;
        }
        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep((long)(Math.random()*1000));
                    _parking.entre(this);
                    Thread.sleep((long)(Math.random()*1000));
                    _parking.leave(this);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }


    class main {
        public static final int MAX_CAPACITY = 3;
        public static void main (String[] args){

            Parking parking = new Parking(MAX_CAPACITY);
            Car FIAT = new Car("fiat", parking);
            Car PORCHE = new Car("Porche", parking);
            Car AUDI = new Car("Audi", parking);
            Car BMW = new Car("BMW", parking);

            FIAT.star();
            PORCHE.star();
            AUDI.star();
            BMW.star();

            Thread.sleep(10000);

            FIAT.interrupt();
            PORCHE.interrupt();
            AUDI.interrupt();
            BMW.interrupt();
        }

    }

}
