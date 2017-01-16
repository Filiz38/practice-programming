package ascii.big;

import ascii.AbstractFont;
import font.CaracterInterface;

public class FontBig extends AbstractFont implements FontBigInterface
{
    private char symbolHorizontal;
    private char symbolVertical;
    private char symbolLtR;
    private char symbolRtL;
    
    
    public FontBig()
    {
        super();
        this.symbolHorizontal='_';
        this.symbolVertical='|';
        this.symbolLtR ='\\';
        this.symbolRtL ='/';
        
    }
    
   protected void initLineHeight()
   {
       this.lineHeight=6;
   }
   
   protected CaracterInterface createCaracter(char caracter)
   {
//       travail à faire if else
//       if('F' ==caractere){
//       return new F(this);
//       }else if('T' == caracter){
//           return new T(this);
//      }
       
       return new F(this); // <-----temporaire 
   }
   
   protected void initSymbolDefault()
   {
       this.symbolDefault=' ';
   }
    
   public char getSymbolHorizontal()
   {
       return this.symbolHorizontal;
   }
   
   public char getSymbolVertical()
   {
       return this.symbolVertical;
   }
   
   public char getSymbolLtR()
   {
       return this.symbolLtR;
   }
   
   public char getSymbolRtL()
   {
       return this.symbolRtL;
   }
}

