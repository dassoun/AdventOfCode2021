import java.util.ArrayList;

import com.jco.utils.FileTransfom;

public class Day01b {

	public static void main(String[] args) {
		String fileName = "inputs/day01.txt";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = FileTransfom.fileToIntList(fileName);
		
		int nb = 0;
		for (int i = 0; i < list.size() - 3; i++) {
			int sum1 = 0;
			int sum2 = 0;
			
			for (int j = i; j < i + 3; j++) {
				sum1 += list.get(j);
			}
			for (int k = i + 1; k < i + 4; k++) {
				sum2 += list.get(k);
			}
			
			if (sum2 > sum1) {
				nb++;
			}
		}
		
		System.out.println(nb);
	}

}
