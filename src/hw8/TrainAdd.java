package hw8;

import java.util.ArrayList;
import java.util.List;

public class TrainAdd {

	public static void main(String[] args) {
		List<Train> train = new ArrayList<>();
		train.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));
		train.add(new Train(118, "自強", "高雄", "台北", 500));
		train.add(new Train(1288, "區間", "新竹", "基隆", 400));
		train.add(new Train(122, "自強", "台中", "花蓮", 600));
		train.add(new Train(1222, "區間", "樹林", "七堵", 300));
		train.add(new Train(1254, "區間", "屏東", "基隆", 700));

		for (Train t : train) {
			System.out.println(
					t.getNumber() + "," + t.getType() + "," + t.getStart() + "," + t.getDest() + "," + t.getPrice());
		}
		

	}

}
