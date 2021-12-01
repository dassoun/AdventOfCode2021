import java.util.ArrayList;

import com.jco.utils.FileTransfom;

public class Day01a {

	public static void main(String[] args) {
		String fileName = "inputs/day01.txt";
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = FileTransfom.fileToIntList(fileName);
		
		int nb = 0;
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) > list.get(i-1)) {
				nb++;
			}
		}
		
		System.out.println(nb);
	}

}
