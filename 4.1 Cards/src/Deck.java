import java.util.ArrayList;

public class Deck 
{
	private ArrayList<Card> unDealt;
	private ArrayList<Card> Dealt;
	
	public boolean isEmpty()
	{
		int dealtcards = Dealt.size();
		int undealtcards = unDealt.size();
		if (dealtcards + undealtcards == 0)
		{
			return true;
		}
		else 
		{
			return false; 
		}
	}
	public int size()
	{
		return unDealt.size();
	}
	
	public Card deal()
	{
		
		unDealt.get(index);
		unDealt.remove(index);
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
		this.unDealt = unDealt;
		this.Dealt = Dealt;
	}
}
