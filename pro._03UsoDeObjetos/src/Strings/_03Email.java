package Strings;

import java.util.Scanner;

public class _03Email 
{
	public static void main(String[] args) 
	{
		Scanner tec = new Scanner(System.in);
		System.out.print("Introduce tu dirección de email: ");
		String email = tec.nextLine();
		System.out.println("Nombre de usuario: " + email.substring(0, email.indexOf('@')));
		System.out.println("Subdominio: " + email.substring(email.indexOf('@') + 1, email.lastIndexOf('.')));
		System.out.println("Dominio: " + email.substring(email.lastIndexOf('.') + 1));
	}

}
