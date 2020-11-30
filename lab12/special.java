public class special implements bonus_expansion {
	protected int bonus_num; //число бонусов
	protected int continuation; //длительность в днях
	public special() { //конструктор без параметров
		this.bonus_num = 5;
		this.continuation = 1;
	}
	public special(int a, int b) {
		this.bonus_num = a;
		this.continuation = b;
	}
	public special(int a) { //конструктор с параметром для создания массива
		this.bonus_num = a;
		this.continuation = 1;
	}
	public void change_bonus_num (int a) { //изменение числа бонусов
		this.bonus_num = a;
	}
	public void change_continuation(int a) { //изменение длительности
		this.continuation = a;
	}
	public void output() { //вывод 
		System.out.printf("Number of bonuses: %d\nContinuation: %d\n", bonus_num, continuation);
	}
	public void reduce_bonus() { //сокращение числа бонусов
		System.out.println("\nDecreasing number of bonuses");
		this.bonus_num = bonus_num - 2;
		System.out.println("Number of bonuses decreased on 2");
	}
	public void reduce_bonus_on_num(int a)
    {
        System.out.println("\nDecreasing number of bonuses");
        this.bonus_num -= a;
        System.out.printf("Number of bonuses decreased on %d\n", a);
    }
	public void expand_bonus_num()
    {
        System.out.println("\nIncreasing number of bonuses");
        this.bonus_num += 2;
        System.out.println("Number of bonuses increased on 2");
    }
	public void set_default() { //установка значений по умолчанию
		this.bonus_num = 5;
		this.continuation = 2;
	}
	public String toString() 
	{
		return "Number of bonuses: " + bonus_num + "\nContinuation: " + continuation + "\n";
	}

}