public class limited_special extends special {
	int times_per_year;
    public limited_special(int a, int b, int c) {
		super(a, b);
        times_per_year = c;
	}
    public void output() {
		System.out.printf("Number of bonuses: %d\nContinuation: %s\nTimes per year: %d\n", bonus_num, continuation, times_per_year);
    }
    public void change_times_per_year(int a) {
        this.times_per_year = a;
    }
	public void reduce_bonus_on_num(int a, int b)
    {
		System.out.println("\nDecreasing number of bonuses and times per year");
        this.bonus_num -= a;
        this.times_per_year -= b;
        System.out.printf("Number of bonuses decreased on %d, times per year decreased on %d\n", a, b);
    }
	public void set_default() {
		super.set_default();
		this.times_per_year = 4;
	}
	public String toString() 
	{
		return "Number of bonuses: " + bonus_num + "\nContinuation: " + continuation + "\nTimes per year: " + times_per_year + "\n";
	}
}