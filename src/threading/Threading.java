/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author mahmoud_mohsen
 */
public class Threading implements Runnable {
    
    @Override
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("inside the thread");
        }
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Threading task = new Threading();
        Thread th = new Thread(task);
        th.start();
        for(int i = 0; i<10; i++  ){
            System.out.println("inside main thread");
           
        }
        System.out.println("inside main thread");
        // TODO code application logic here
    }
    
}
