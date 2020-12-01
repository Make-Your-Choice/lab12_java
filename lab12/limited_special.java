public class limited_special extends special implements bonus_expansion { //наследование от класса бонусов - класс ограниченные бонусы с поддержкой интерфейса
	int times_per_year; //периодичность в год
    public limited_special(int a, int b, int c) { //конструктор с вызовом конструктора базового (супер) класса
		super(a, b);
        times_per_year = c;
	}
    public void output() {
		System.out.printf("Number of bonuses: %d\nContinuation: %s\nTimes per year: %d\n", bonus_num, continuation, times_per_year);
    }
    public void change_times_per_year(int a) { //изменение периодичности
        this.times_per_year = a;
    }
	public void reduce_bonus_on_num(int a, int b) { //перегрузка базового метода сокращения числа бонусов на заданное число
		System.out.println("\nDecreasing number of bonuses and times per year");
        this.bonus_num -= a;
        this.times_per_year -= b;
        System.out.printf("Number of bonuses decreased on %d, times per year decreased on %d\n", a, b);
    }
	public void expand_bonus_num() { //метод интерфейса и перегрузка базового метода увеличения числа бонусов
        System.out.println("\nIncreasing number of bonuses");
        this.bonus_num += 4;
        System.out.println("Number of bonuses increased on 4");
    }
	public void set_default() { //перегрузка базового метода установления значений по усолчанию с вызовом метода базового (супер) класса
		super.set_default();
		this.times_per_year = 4;
	}
	public String toString() { //перегрузка toString
		return "Number of bonuses: " + bonus_num + "\nContinuation: " + continuation + "\nTimes per year: " + times_per_year + "\n";
	}
}