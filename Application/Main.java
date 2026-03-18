package Application;

import Application.Threads.MultithreadThing;
import Application.Threads.Thing;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i <= 3; i++){
            MultithreadThing myThing = new MultithreadThing(i);
            //myThing.start();
        }
            
            Thing thing = new Thing();
            Thread myThread = new Thread(thing);

            myThread.start();
            

    }
}