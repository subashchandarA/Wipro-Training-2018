import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class SetDemo {

	public static void main(String[] args) {

		Card c1 = new Card("A", 1);
		Card c2 = new Card("A", 2);
		Card c3 = new Card("A", 7);
		Card c4 = new Card("B", 2);
		Card c5 = new Card("C", 2);
		Card c6 = new Card("D", 1);
		Card c7 = new Card("D", 6);
		Card c8 = new Card("C", 1);

		List<Card> cardList = new ArrayList<Card>();

		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();

		cardList.add(c1);
		cardList.add(c2);
		cardList.add(c3);
		cardList.add(c4);
		cardList.add(c5);
		cardList.add(c6);
		cardList.add(c7);
		cardList.add(c8);

		Iterator<Card> itr = cardList.iterator();

		while (itr.hasNext()) {

			Card card = itr.next();
			boolean flag = ht.containsKey(card.getSymbol());

			if (flag == false) {
				ht.put(card.getSymbol(), card.getNumber());
			}
		}
		List<String> v = new ArrayList<String>(ht.keySet());
		Collections.sort(v);

		for (String str : v) {
			System.out.println(str + " " + ht.get(str));
		}
	}
}
