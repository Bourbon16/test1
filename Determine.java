package test;
import java.util.Scanner;

public class Determine 
{
	Scanner scanner = new Scanner(System.in);
	private char[] code = new char[15];
//	private char t;
	
	public void determine()
	{
		System.out.println("\n=========================");
		System.out.println("    欢迎使用密码管理系统");
		System.out.println("=========================");
		System.out.printf("请输入密码：");
		String str = scanner.next();
		code =str.toCharArray();
		char ch;
		boolean flag1;
		boolean flag2;
		boolean numflag = false;
		boolean lflag = false;
		boolean cflag = false;
		
		if(str.matches("\\d+"))		//判断只包含数字
		{
			flag1 = true;
		}
		else
		{
			flag1 = false;
		}
		
		if(str.matches("[a-zA-Z]+"))		//判断只包含字母
		{
			flag2 = true;
		}
		else
		{
			flag2 = false;
		}
		
		for(int i = 0; i < code.length; i++)
		{
			ch = code[i];
			if(Character.isDigit(ch))
			{
				numflag = true;
			}
			else if(Character.isLowerCase(ch))
			{
				lflag = true;
			}
			else if(Character.isUpperCase(ch))
			{
				cflag = true;
			}
		}
				
		if(code.length < 8 || (code.length >= 8 && (flag1 || flag2)))
		{
			System.out.println("弱强度");
		}

		if(code.length >= 8 && numflag && lflag && cflag )
		{
			System.out.println("高强度");
		}
		else if(code.length >= 8)
		{
			System.out.println("中强度");
		}
	}
}
