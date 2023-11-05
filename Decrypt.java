package test;
import java.util.Scanner;

public class Decrypt 
{
	Scanner scanner = new Scanner(System.in);
	private char[] code = new char[15];
	char t;
	
	public void decrypt()
	{
		System.out.println("\n=========================");
		System.out.println("    欢迎使用密码管理系统");
		System.out.println("=========================");
		System.out.printf("请输入要解密的数字密码：");
		String str = scanner.next();
		code =str.toCharArray();
		
		for(int i = 0; i < (int)code.length/2; i++)
		{
			t = code[i];
			code[i] = code[code.length-1-i];
			code[code.length-1-i] = t;
		}
		
		t = code[0];
		code[0] = code[code.length-1];
		code[code.length-1] = t;
		
		for(int i = 0; i < code.length; i++)
		{
			int ascii = (int)code[i];
			ascii = ascii - (i+1) - 3;
			code[i] =(char)ascii;
		}
		
		System.out.printf("解密后的结果是：");
		for(int i = 0; i < code.length; i++)
		{
			System.out.printf("%c",code[i]);
		}
		System.out.printf("\n\n");
	}
}
