import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat form1 = new SimpleDateFormat("dd/MM/yyyy");//FORMATO DA DATA EM DIA,MES E ANO COM QUATRO DIGITOS
		SimpleDateFormat form2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");//PARA TER HORAS MINUTOS E SEGUNDOS TAMBEM	
		SimpleDateFormat form3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		form3.setTimeZone(TimeZone.getTimeZone("GMT"));
			
	Date x1 = new Date();//PEGA DATA E HORA DO MOMENTO ATUAL
	Date x2 = new Date(System.currentTimeMillis());//PEGA DATA E HORA DO MOMENTO ATUAL
	Date x3 = new Date(0L);//HORARIO UTC DO JAVA 
	Date x4 = new Date(1000L * 60L * 60 * 5L);
	
	Date y1 = form1.parse("28/02/2021");//A OPERAÇÃO PARSE VAI RECEBER UM DADO NO FORMATO DE STRING E CONVERTE PARA DATA
	Date y2 = form2.parse("28/02/2021 15:50:33");
	Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));//HORARIO UTC
	
	System.out.println("x1: "+x1);//HORARIO NAO FORMATADO
	System.out.println("x2: "+x2);
	System.out.println("x3: "+x3);
	System.out.println("x3: "+x4);
	System.out.println("y1: "+y1);
	System.out.println("y2: "+y2);
	System.out.println("y3: "+y3);
	
	
	System.out.println("-------------------");
	
	System.out.println("x1: "+form2.format(x1));
	System.out.println("x2: "+form2.format(x2));
	System.out.println("x3: "+form2.format(x3));
	System.out.println("x3: "+form2.format(x4));
	System.out.println("y1: "+form2.format(y1));//HORARIO FORMATADO
	System.out.println("y2: "+form2.format(y2));
	System.out.println("y3: "+form2.format(y3));

	System.out.println("-------------------");
	
	
	System.out.println("y1: "+form3.format(y1));//HORARIO UTC
	System.out.println("y2: "+form3.format(y2));
	System.out.println("y3: "+form3.format(y3));


	}
}
