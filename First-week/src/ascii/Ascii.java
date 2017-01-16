package ascii;

import ascii.big.FontBig;
import ascii.big.FontBigInterface;
import font.CaracterInterface;

public class Ascii {

	public static void main (String[] args)
	
	{
	
	FontBigInterface font                      =new FontBig();
	CaracterInterface caracter                 = font.getCaracter('d');
	CaracterInterface[] caracterCollection     =new CaracterInterface[1]; //caracterCollection suite de caractères
	caracterCollection[0]                      =caracter;
	
	// Faire la triple boucle
	
	for (int i = 0; i < font.getLineHeight(); i++) {
	    

        for (int j = 0; j < caracterCollection.length; j++) {
            

            char[][] definition                      = caracterCollection[j].toAscii();

            for (int k = 0; k < definition[i].length; k++) {
     //                definition[i][k];
                System.out.print(definition[i][k]);
                
            }
            
                      
        }

        System.out.println("");
	}
  
		System.out.println(caracter);
	
	}
}

