import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class manipulandoDtata {

	public static void main(String[] args) {
		SimpleDateFormat form1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z")); // FORMATO UTC
		
		System.out.println(form1.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		int minutos = cal.get(Calendar.MINUTE);//VAI ME DEVOLVER A QUANTIDADE DE MINUTOS
		int mes = 1 + cal.get(Calendar.MONTH);//COLOCA O +1 POS O CALEDARIO COMEÇA COM 0(JANEIRO = 0)
		
		System.out.println("Minutos: "+minutos); 
		System.out.println("Mes: "+mes);
		
		
	}

}
