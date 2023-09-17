public class AnimalThread extends Thread {
    String animal;
    int priority;
    int distance;

    AnimalThread(String name, int priority){
        this.animal = name;
        this.priority = priority;
        this.distance = 0;
    }

    public void run(){
        try{
        do {
            sleep(1000);
            System.out.println(animal + " пробежал " + distance + " м.");
            distance += 10;
        }while (distance <= 100);
        if (distance == 100);{
                System.out.println(animal + " финишировал.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public int getDistance(){
        return this.distance;
}}