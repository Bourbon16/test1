package test;
import java.util.Scanner;

public class Demo 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Encrypt ec = new Encrypt();
		Decrypt dc = new Decrypt();
		
		Boolean flag = true;
		while(flag)
		{
			System.out.println("=========================");
			System.out.println("    欢迎使用密码管理系统");
			System.out.println("=========================");
			System.out.println("        请选择操作:");
			System.out.println("1.加密\n2.解密");
			
			System.out.printf("\n请输入选项序号：");
			switch(scanner.nextInt())
			{
			case 1:
				ec.encrypt();
				break;
			case 2:
				dc.decrypt();
				break;
			}
		}
		
		scanner.close();
	}
}
