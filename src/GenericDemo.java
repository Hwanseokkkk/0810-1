
public class GenericDemo { // Collection에서만 사용한다.
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5);
		int result = car.getValue();
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue();
		Car<String> car2 = new Car<String>("차차차");
		String result2 = car2.getValue();
		System.out.println(result + "\n" + result1 + "\n" + result2);
	}
}
class Car<T> { // 모든 타입을 받을 수있다.

	private T value;
	public Car(T value) {
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}

}
