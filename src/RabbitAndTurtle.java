public class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Кролик", Thread.MAX_PRIORITY);
        AnimalThread turtle = new AnimalThread("Черепаха", Thread.MIN_PRIORITY);

        rabbit.start();
        turtle.start();

        while (rabbit.isAlive() && turtle.isAlive()) {
            if (rabbit.getDistance() < turtle.getDistance()) {
                rabbit.setPriority(Thread.MAX_PRIORITY);
                turtle.setPriority(Thread.MIN_PRIORITY);
            } else {
                rabbit.setPriority(Thread.MIN_PRIORITY);
                turtle.setPriority(Thread.MAX_PRIORITY);
            }
        }

        if (rabbit.getDistance() > turtle.getDistance()) {
            System.out.println("Кролик победил!");
        } else {
            System.out.println("Черепаха победила!");
        }
    }
}