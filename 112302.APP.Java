package pac;

public class MATH {
public static void main(String[] args) throws InterruptedException {
	int arr[][]={
			{100,200},	
			{999,666},	
			{88,55},	
			{0,5},	
	};
	while (true) {
		Thread.sleep(1000);
		System.out.println("又过去了一秒");
		int rdm=(int)(Math.random()*10%4);
		System.out.println(arr[rdm][0]+","+arr[rdm][1]);
	}
}
}
