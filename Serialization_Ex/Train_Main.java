package Serialization_Ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Serialization.Admin;

public class Train_Main {
	public static void main(String[] args)throws IOException, ClassNotFoundException {
		/*Train T1=new Train(1206,"Coal","Guwahati",90);
		Train T2=new Train(1207,"Electricity","Bengalore",140);
		FileOutputStream f=new FileOutputStream("TrainInfo1.txt");
		ObjectOutputStream out=new ObjectOutputStream(f);
		out.writeObject(T1);
		out.writeObject(T2);*/
		FileInputStream f2=new FileInputStream("TrainInfo1.txt");
		ObjectInputStream out=new ObjectInputStream(f2);
		Train T11=(Train)out.readObject();
		Train T21=(Train)out.readObject();
		T11.display();
		T21.display();
	}
}
