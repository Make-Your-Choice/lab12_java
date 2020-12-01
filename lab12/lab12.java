import java.util.Scanner;
	
public class lab12 { //основной класс

public static boolean isParsable(String s) { //функция для проверки возможности преобразования строки в число
    try {
			Integer.parseInt(s);
		}
		catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int x = 0, y = 0, z = 0, n, m, r; //переменные
		int x2, y2;
		String x1, y1,z1;
		String s1, s2, s3; //строки
		Scanner in = new Scanner(System.in);
		result res = new result();
		int a, b, c;
		int res1, res2;
		
		limited_special lim_offer1 = new limited_special(5, 6, 2);
		special sp_offer1 = new special(8, 4);
		System.out.println("\nWorking with a derivative class");
		System.out.println("\nlim_offer1\n");
		System.out.printf("%s", lim_offer1.toString());
		System.out.println("\nsp_offer1\n");
		System.out.printf("%s", sp_offer1.toString());
		System.out.println("\nOverload without basic method (reducing bonus num)"); //перегрузка без вызова базового метода
		lim_offer1.reduce_bonus_on_num(2, 1);
		System.out.println("\nlim_offer1\n");
		System.out.printf("%s", lim_offer1.toString());
		System.out.println("\nOverload with basic method (setting default val)"); //перегрузка с вызовом базового метода
		lim_offer1.set_default();
		System.out.println("\nlim_offer1\n");
		System.out.printf("%s", lim_offer1.toString());
		
		System.out.println("\nWorking with an abstract class\n");
		payment_cash cash1 = new payment_cash(1);
		payment_card card1 = new payment_card(2);
		res1 = cash1.is_accessible(); //вызов перегруженной виртуальной функции
		if(res1 > 0)
			System.out.println("Cash pay for cash1 is accessible\n");
		else
			System.out.println("Cash pay for cash1 is not accessible\n");
		res2 = card1.is_accessible(); //вызов перегруженной виртуальной функции
		if(res2 > 0)
			System.out.println("Card pay for card1 is accessible\n");
		else
			System.out.println("Card pay for card1 is not accessible\n");
		
		System.out.println("Working with an interface (bonus num expansion)\n");
		sp_offer1.expand_bonus_num(); //вызов метода интерфейса
		System.out.println("\nsp_offer1\n");
		System.out.printf("%s", sp_offer1.toString());
		lim_offer1.expand_bonus_num(); //вызов метода интерфейса
		System.out.println("\nlim_offer1\n");
		System.out.printf("%s", lim_offer1.toString());
		
		s1 = "qqq";
		s2 = "aaa";
		s3 = "zzz";
		book_store book4 = new book_store(s1, s2, s3, 100, 10, 15, 3, 4, 2);
		s1 = "www";
		s2 = "sss";
		s3 = "xxx";
		book_store book5 = new book_store(s1, s2, s3, 200, 20, 25, 5, 6, 1);
		System.out.println("\nShallow cloning (spec_offer.bonus_num) and deep cloning (cash.is_succeed)\n");
		System.out.println("book4");
		System.out.printf("%s", book4.toString());
		System.out.println("book5");
		System.out.printf("%s", book5.toString());
		book4 = (book_store)book5.clone();
		System.out.println("book4");
		System.out.printf("%s", book4.toString());
		book5.spec_offer2.change_bonus_num(10); //мелкое клонирование spec_offer (для book4 bonus_num = 10)
		book5.cash.change_val(3); //глубокое клонирование cash (для book4 is_succeed = 1)
		System.out.println("book4");
		System.out.printf("%s", book4.toString());
		System.out.println("book5");
		System.out.printf("%s", book5.toString());
	}
}

	