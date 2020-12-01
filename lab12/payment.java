abstract class payment { //абстрактный класс оплата
	protected int is_succeed;
	public payment(int a) {
        is_succeed = a;
    }
    public abstract int is_accessible(); //абстрактная функция проверки успешности операции оплаты
}