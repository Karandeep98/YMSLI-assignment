import java.io.*;

public class ReadAndWriteFile {
	public static void main(String[] args) {

		try {
			FileInputStream fin = new FileInputStream(
					"C:\\Users\\ve00ym233\\Documents\\new workspace\\Day_4\\src\\file.txt");
			int data=0;
			while(true) {
				data=fin.read();
				if(data==-1)break;
				System.out.print((char)data);
			}
			fin.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
