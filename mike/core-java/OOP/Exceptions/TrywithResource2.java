//Test27_TryWithResource.java
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class  TryWithResource2{
	public static void main(String[] args) {

//Before Java 7v we must write code as shown below
		FileOutputStream fos1 = null;
		try{	
			fos1 = new FileOutputStream("abc.txt");
			fos1.write('b');
			System.out.println("Data saved successfully");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try{
				if(fos1 !=null)
					fos1.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}

//From Java 7v onwards using t-w-r	we can write consice code as shown below	
		try(	FileOutputStream fos2 = new FileOutputStream("abc.txt");)
        {
			fos2.write('b');
			System.out.println("Data saved successfully");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}