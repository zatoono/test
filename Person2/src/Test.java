
public class Test {

	public static void main(String[] args){
		Person taro = new Person();
		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);

		System.out.println();
		Person jiro = new Person("jiro",20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);

		System.out.println();
		Person saburo = new Person("saburo");
		System.out.println(saburo.name);
		System.out.println(saburo.age);

		System.out.println();
		Person noName = new Person(25);
		System.out.println(noName.name);
		System.out.println(noName.age);

		System.out.println();
		Person hanako = new Person(17,"hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
	}
}
