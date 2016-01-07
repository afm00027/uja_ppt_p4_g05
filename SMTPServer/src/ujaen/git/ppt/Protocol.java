package ujaen.git.pt;

public interface Protol {
	
	public final static String CRLF="\r\n";
	
	
	//Constantes de los estados utilizados
	public final static int S_HELO=1;
	public final static int S_MAIL=2;
	public final static int S_RCPT=3;
	public final static int S_MAIL=4;
	public final static int S_QUIT=5;
	
	
}
