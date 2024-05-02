import java.util.*;
public class lab12
{
public static void main(String[] args)
{
 Multithread c=new Multithread();
 Producer p1=new Producer(c,1);
 Consumer c1=new Consumer(c,1);
 p1.start();
 c1.start();
 }
}
class Multithread{
private int contents;
private boolean available=false;
public synchronized int get(){
while(available==false){
try{
wait();
}catch(InterruptedException c){
}
}
available=false;
notifyAll();
return contents;
}
public synchronized void put(int value){
while(available==true){
try{
wait();
}catch(InterruptedException e){
}
}
contents=value;
available=true;
notifyAll();
}
}
class Consumer extends Thread{
private Multithread multithread;
private int number;
public Consumer(Multithread c,int number)
{
multithread=c;
this.number=number;
}
public void run()
{
int value=0;
for(int i=0;i<10;i++){
value=multithread.get();
System.out.println("consumer# " + this.number+ "get " + value);
}
}
}

class Producer extends Thread{
private Multithread multithread;
private int number;
public Producer(Multithread c,int number)
{
multithread=c;
this.number=number;
}
public void run()
{
for(int i=0;i<10;i++){
multithread.put(i);
System.out.println("producer# "+this.number+"put "+i);
try{
sleep((int) (Math.random()*100));
}catch(InterruptedException e){
}
}
}
}




