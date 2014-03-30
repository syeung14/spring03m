package spring03.spring03a;

import com.ssyeung.sequence.Sequence;
import com.ssyeung.sequence.SequenceGenerator;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		
		SequenceGenerator seq = new SequenceGenerator();
		seq.setInitial(10000);
		String num = seq.getSequence();
		
		System.out.println("Hello World! "  + num);
	}
}
