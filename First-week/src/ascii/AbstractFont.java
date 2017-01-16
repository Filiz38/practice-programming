package ascii;

public abstract class AbstractFont extends font.AbstractFont 
{
	protected char symbolDefault;
	
	protected abstract void initSymbolDefault();
	
	protected AbstractFont()
	{
		super(); // on appelle le constructeur parent
		this.initSymbolDefault();
	}

	public char getSymbolDefault()
	{
		return this.symbolDefault;
}
}
