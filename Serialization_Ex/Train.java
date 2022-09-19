package Serialization_Ex;

import java.io.Serializable;

public class Train implements Serializable{
	int trainNo,speed;
	String source,destination;
	void display() {
		System.out.println("Train No. "+trainNo);
		System.out.println("Source: "+source);
		System.out.println("Destination "+destination);
		System.out.println("Speed: "+speed);
	}
	Train(int tn,String sc,String des,int sp){
		this.trainNo=tn;
		this.source=sc;
		this.destination=des;
		this.speed=sp;
	}
}
