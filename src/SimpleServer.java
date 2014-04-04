import java.net.*;
import java.io.*;

public class SimpleServer {
	public static void main(String args[]) {
		ServerSocket s = null;
		try {
			s = new ServerSocket(9999);
			System.out.println("Server avviato, in ascolto" + " sulla porta 9999");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			while (true) {			
				Socket s1 = s.accept();
				OutputStream s1out = s1.getOutputStream();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
				bw.write("Ciao client sono il server! git creato test online");
				System.out.println("Messaggio spedito a " + s1.getInetAddress()); 
				bw.close();
				s1.close(); 
				//s.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
} 
