package remiseria;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patente {
	private boolean _esCorrecto;
	/*public Patente(String value) {
	// valida formato AAA 999
	if (value.length() == 6)
		if (value.charAt(0) >= 'A' && value.charAt(0) <= 'Z')
			if (value.charAt(1) >= 'A' && value.charAt(1) <= 'Z')
				if (value.charAt(2) >= 'A' && value.charAt(2) <= 'Z')
					if (value.charAt(3) >= '0' && value.charAt(3) <= '9')
						if (value.charAt(4) >= '0' && value.charAt(4) <= '9')
							if (value.charAt(5) >= '0' && value.charAt(5) <= '9')
								System.out.println("OK");
							else
								System.out.println("ERROR");
						else
							System.out.println("ERROR");
					else
						System.out.println("ERROR");
				else
					System.out.println("ERROR");
			else
				System.out.println("ERROR");
		else
			System.out.println("ERROR");
	else
		System.out.println("ERROR");
}
*/

	public Patente (String value,int tipo){
		String pattern="";
		
		if (tipo==0){ //Auto Viejo
			 pattern= "[A-Z][A-Z][A-Z][0-9][0-9][0-9]";
		}
		if(tipo==1){ //Moto Vieja
			 pattern= "[0-9][0-9][0-9][A-Z][A-Z][A-Z]";
		}
		if (tipo==2){ //Auto Nuevo
			pattern= "[A-Z][A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]";
		}
		if (tipo==3){ //Moto Nueva	
			pattern= "[A-Z][0-9][0-9][0-9][A-Z][A-Z][A-Z]";
		}
	 
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(value);
		
		if (m.matches()){
		   	System.out.println("OK");
		}
		else {
 			 System.out.println("ERROR");
		}
	}
}


