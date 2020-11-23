package pac;

import java.util.Random;
import java.util.Scanner;

public class APP {
	public static void main(String[] args) {
		while (true) {
		System.out.println("输入一个字符：");
		Scanner scanner=new Scanner(System.in);
		String a=scanner.next();
		int x,y;
		x=(int)(Math.random()*100);
		y=(int)(Math.random()*100);
			if (a.equals(a)) {
				System.out.println(x+","+y);
			} else {
				System.out.println("程序错误！");
			}
		}
		
	}
	}
