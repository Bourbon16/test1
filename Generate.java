package test;
import java.util.Scanner;
import java.security.SecureRandom;

public class Generate 
{
	Scanner scanner = new Scanner(System.in);
	SecureRandom random = new SecureRandom();
	StringBuilder passwordBuilder = new StringBuilder();
	
	public void generate()
	{
		System.out.println("\n=========================");
		System.out.println("    欢迎使用密码管理系统");
		System.out.println("=========================");
		String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";	
		String characterSet = uppercaseLetters + lowercaseLetters + numbers;
		System.out.printf("输入密码长度：");
		int length = scanner.nextInt();
		
		for (int i = 0; i < length; i++) 
		{
			int randomIndex = random.nextInt(characterSet.length());
			char randomChar = characterSet.charAt(randomIndex);
			passwordBuilder.append(randomChar);
		}
	
		String password = passwordBuilder.toString();
		System.out.println("生成的密码为：" + password);
		passwordBuilder = new StringBuilder();
	}
}
