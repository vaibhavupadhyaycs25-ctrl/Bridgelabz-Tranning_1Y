import java.util.Scanner;
class Vaibhav{
public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  a amer age's");
	int Amar = sc.nextInt();
	System.out.println("Enter  a akebar age's");
	int Akbar = sc.nextInt();
	System.out.println("Enter  a Athony age's");
	int Anthony = sc.nextInt();
	if(Akbar<Amar&&Akbar<Anthony){
		System.out.println("Akbar is young " +Akbar);
	}
	else if (Amar<Akbar&&Amar<Anthony){
		System.out.println("Amar is young" +Amar);
	}
	else if (Anthony<Akbar&&Anthony<Amar){
		System.out.println("Anthony is young" +Anthony);
	}
	}
}