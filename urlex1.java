# urlex1 file


import java.net.*;
public class urlex1 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://github.com/Jay0774/summerinternship");
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host Name : " + url.getHost());
			System.out.println("port number : " + url.getPort());
			System.out.println("defaultport : " +url.getDefaultPort());
			System.out.println("query : " +url.getQuery());
			System.out.println("path : " +url.getPath());
			System.out.println("file : " +url.getFile());
		}catch(Exception e)
		{
			System.out.print(e);
		}

	}

}
