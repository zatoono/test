public class Test {

	public static void main(String[] args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "電話番号";
		taro.address = "住所";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();


		System.out.println();
		Person zirou = new Person();
		zirou.name = "木村次郎";
		zirou.age = 18;
		zirou.phoneNumber = "電話番号";
		zirou.address = "住所";

		System.out.println(zirou.name);
		System.out.println(zirou.age);
		System.out.println(zirou.phoneNumber);
		System.out.println(zirou.address);
		zirou.talk();
		zirou.walk();
		zirou.run();


		System.out.println();
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "電話番号";
		hanako.address = "住所";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();


		System.out.println();
		Person onozato = new Person();
		onozato.name = "小野里雄貴";
		onozato.age = 23;
		onozato.phoneNumber = "070-1261-5259";
		onozato.address = "東京";

		System.out.println(onozato.name);
		System.out.println(onozato.age);
		System.out.println(onozato.phoneNumber);
		System.out.println(onozato.address);
		onozato.talk();
		onozato.walk();
		onozato.run();





		System.out.println();
		Robot aibo = new Robot();
		aibo.name = "aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		System.out.println();
		Robot asimo = new Robot();
		asimo.name = "asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		System.out.println();
		Robot pepper = new Robot();
		pepper.name = "pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
