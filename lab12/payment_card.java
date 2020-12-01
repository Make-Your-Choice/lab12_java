class payment_card extends payment { //наследник абстрактного класса
	public payment_card(int a) { //вызов конструктора базового (супер) класса
		super(a);
    }
    public int is_accessible() { //перегрузка абстрактной функции
        return is_succeed * 0;
    }
}