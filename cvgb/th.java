import java.util.Scanner;

class th extends Thread{
th(String str){
super(str);
}
public void run(){
long start = System.currentTimeMillis();
	
for(int i=1;i<=100;i++)
{
	if(i%10==0)
	{
		System.out.println(i);
	}
		try{	
        Thread.sleep(1000);
    }
    catch(Exception e){}

        System.out.println("Sleep time in ms = "+(System.currentTimeMillis()-start));
}
}
public static void main(String args[]){

Scanner input=new Scanner(System.in);
String str=input.next();
th t1=new th(str);
t1.start();
}
}