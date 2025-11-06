import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable {
		int id;
		String name;
		student(int id,String name){
			this.id=id;
			this.name=name;	
		}
		public void display() {
			System.out.println(id+" "+name);
		}
	}


public class Serialization {

	public static void main(String[]args) throws ClassNotFoundException {
		student s1=new student(1,"Niru");
		
		try {
			
			FileOutputStream fos=new FileOutputStream("student.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			fos.close();
			s1.display();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
		FileInputStream fis=new FileInputStream("student.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		student s2=(student) ois.readObject();
		fis.close();
		ois.close();
		s2.display();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}

	

}
