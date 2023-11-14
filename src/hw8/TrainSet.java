package hw8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TrainSet {

	public static void main(String[] args) {
		Set<Train> train = new HashSet<>();
		Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train train3 = new Train(118, "自強", "高雄", "台北", 500);
		Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);

		train.add(train1);
		train.add(train2);
		train.add(train3);
		train.add(train4);
		train.add(train5);
		train.add(train6);
		train.add(train7);

		Iterator<Train> trainS = train.iterator();

		while (trainS.hasNext()) {
			System.out.println(trainS.next());
		}

	}

}
