class VehicleDemo {
    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();

        miniven.passengers = 7;
        miniven.fuelcap = 16;
        miniven.mpg = 21;

        System.out.print("Мини-фypгoн может перевезти " + miniven.passengers + " пассажиров. ");
        miniven.range();
    }
}
