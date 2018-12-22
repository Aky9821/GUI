package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksha
 */
import java.util.*;

public class Time {

    static Timer ob  = new Timer();
    
    public static void main(String[]args)
    {
        ob.schedule(new Task(), 0, 1000);
    }

    static class Task extends TimerTask {

        int a = 40;

        public void run()
        {
            System.out.println("\f Time Left "+a +"seconds");
            a--;
            if(a<0)
            {
                ob.cancel();
            }
        }

    }
}
