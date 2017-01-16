package ascii.big;

import ascii.AbstractCaracter;
import font.CaracterInterface;

public class F extends AbstractCaracter implements CaracterInterface

{
    public F(FontBig font) // font possede la methode getLineHeight
    {
        // affecter des valeurs a definition reconstruction de la lettre 
        this.definition = new char [font.getLineHeight()][8];
//                this.definition[0][7] =
//                this.definition[1][2] =
//                this.definition[2][1] =
//                this.definition[2][3] =
//                this.definition[3][1] =
//                this.definition[3][3] =
//                this.definition[4][1] = 
//                this.definition[4][7] = font.getSymbolDefault();
                
                this.definition[1][7] =
                this.definition[2][0] =
                this.definition[2][2] =
                this.definition[3][0] =
                this.definition[3][2] =
                this.definition[4][0] =
                this.definition[4][2] =
                this.definition[5][7] = font.getSymbolVertical();
                
                this.definition[0][2] =
                this.definition[0][3] =
                this.definition[0][4] =
                this.definition[0][5] =
                this.definition[0][6] =
                this.definition[1][3] = 
                this.definition[1][4] = 
                this.definition[1][5] = 
                this.definition[1][6] =
                this.definition[4][3] =
                this.definition[4][4] =
                this.definition[4][5] =
                this.definition[4][6] =
                this.definition[5][2] =
                this.definition[5][3] =
                this.definition[5][4] =
                this.definition[5][5] =
                this.definition[5][6]=font.getSymbolHorizontal();
                
                this.definition[1][1] = font.getSymbolRtL();
                this.definition[5][1] = font.getSymbolLtR();
                
                
                
                //  déclaration sous forme de tableau
                //  char[][]fooo={
                //              {},
                //              {}      
                //              };
                //  this.definition = fooo;
        
    }
   
    public String toString() // hihihihi =D
    {
        return "F";
    }
}


