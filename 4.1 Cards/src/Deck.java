import java.util.ArrayList;

public class Deck 
{
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public boolean isEmpty()
	{
		if 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Deck(String[]ranks,String[]suits,int[]pointValues)
	{
		for(int i = 0; i < ranks.length;i++)
		{
			for(int j= 0; j < suits.length;j++)
			{
				unDealt.add(new Card(ranks[i],suits[j],pointValues[i]));
			}
		}
	}
}
