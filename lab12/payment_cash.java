class payment_cash extends payment implements Cloneable { //наследник абстрактного класса с поддержкой клонирования
	public payment_cash(int a) { //вызов конструктора базового (супер) класса
		super(a);
    }
	public Object clone() { //клонирование
		try {
			return (payment_cash)super.clone();
		}
		catch(CloneNotSupportedException e) {
		}
		return this;
	}
	public String toString() { //перегрузка toString
		return "Access code: " + is_succeed + "\n";
	}
	public void change_val(int a) { //изменение кода доступа
		is_succeed = a;
	}
    public int is_accessible() { //перегрузка абстрактной функции
        return is_succeed * 1;
    }
}