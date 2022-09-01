//Francesco Messina, Discussion post week 13: 16.13 (Counting Duplicate Words).
import java.util.HashSet;
import java.util.Iterator;

public class Week13
{
	public static void main(String args[]) throws Exception
	{
		String tragedy = "Did you ever hear the tragedy of Darth Plagueis the Wise? I thought not. It's not a story the Jedi would tell you. It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life... He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. The dark side of the Force is a pathway to many abilities some consider to be unnatural. He became so powerful... the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. Ironic, he could save others from death, but not himself.";
		HashSet<String> h = new HashSet<String>();
		String end = tragedy.replaceAll("\\p{Punct}", "");
		String [] tragedyWords = end.split(" ");

		for(int i = 0; i < tragedyWords.length; i++)
		{
			h.add(tragedyWords[i].toLowerCase());
		}

		Iterator<String> iterator = h.iterator();
		int count = 0;
		
		System.out.println("List of words that appear multiple times in the sentence: \n" + tragedy);
		while(iterator.hasNext() )
		{
			String temp = iterator.next();
			if(h.contains(temp))
			{
				iterator.remove();
				System.out.print(temp + ", ");
				count++;
			}
		}
		System.out.println("\nThere are " + count + " duplicate words in the sentence.");
	}
}
