package ascii;

public abstract class AbstractCaracter
{
    
    protected char[][]definition; // attribut
    
    public char[][] toAscii() // méthode
    {
        return this.definition;
    }
    
}
