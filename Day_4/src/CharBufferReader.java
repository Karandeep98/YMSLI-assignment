import java.io.*;

public class CharBufferReader {
	public static void main(String[] args) {
		BufferedReader fin = new BufferedReader(new InputStreamReader(System.in));
		try {
			BufferedWriter fout = new BufferedWriter(new FileWriter(
					new File("C:\\Users\\ve00ym233\\Documents\\new workspace\\Day_4\\src\\output_file.txt")));
			BufferedReader fread = new BufferedReader(new FileReader(
					"C:\\Users\\ve00ym233\\Documents\\new workspace\\Day_4\\src\\output_file.txt"));
			fout.write(fin.readLine());

			fin.close();
			fout.close();
			String data;
			System.out.println("Output File:");
			while (true) {
				data = fread.readLine();
				if (data == null)
					break;
				System.out.println(data);
			}
			fread.close();
		} catch (IOException e) {
			System.out.println("IO exception");
		}
	}
}
