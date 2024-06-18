package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// 車を生成
		Car_Chapter15 car = new Car_Chapter15();
		
		//ギアチェンジする
		car.gearChange(3);
		
		//速度を表示する
		car.run();
	}

}
