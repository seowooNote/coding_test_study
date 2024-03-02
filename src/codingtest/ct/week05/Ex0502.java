package codingtest.ct.week05;

import java.util.NavigableSet;
import java.util.TreeSet;

// TreeSet
public class Ex0502 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		// 페이지네이션 
		// 내림차순
		NavigableSet<Integer> desc = scores.descendingSet();
		for(Integer score : desc) {
			System.out.print(score + " ");
		}
		System.out.println();
		// 오름차순은 먼저 내림차순 해주고 그 대상을 다시 내림차순해주면 오름차순이 됨
		NavigableSet<Integer> asc = desc.descendingSet();
		for(Integer score : asc) {
			System.out.print(score + " ");
		}

	}

}
