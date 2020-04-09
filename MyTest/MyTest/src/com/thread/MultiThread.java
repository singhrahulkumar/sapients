package com.thread;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

class BoundedBufferProblem{
    LinkedList<Character> buffer = new LinkedList<Character>();
    FileInputStream fis = null;
    int count;
    final int CAPACITY = 10000;
    public BoundedBufferProblem() {
        try {
            fis = new FileInputStream("C:/workspace_practices/MyTest/src/com/thread/MultiThread.java");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
    }
    public void produce()  throws IOException {
        if(fis == null) {
            return;
        }
        while(true) {
            synchronized (this) {
                while(buffer.size() == CAPACITY) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                //System.out.println("Producer product " + (count));
                int c;
                while(true) {
                    c = fis.read();
                    if(c == -1) {
                        buffer.add((char)0);
                        break;
                    }
                    buffer.add((char)c);
                    if(c == 10) break;
                }
                if(c == -1) {
                    fis.close();
                    break;
                }
                notify();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
    
    public void consume()  throws IOException {
        if(fis == null) {
            return;
        }
        while(true) {
            synchronized (this) {
                while(buffer.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                char c = buffer.removeFirst();
                if(c == (char)0) break;
                System.out.print(c);
                notify();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

public class MultiThread{
    public static void main(String args[]) {
        final BoundedBufferProblem bbp = new BoundedBufferProblem();
        
        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    bbp.produce();
                }catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
            
        });
        
        //t.setPriority(Thread.MAX_PRIORITY);
        
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    bbp.consume();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
        });
        
        //t1.setPriority(Thread.MAX_PRIORITY);
        
        t.start();
        t1.start();
    }
}






