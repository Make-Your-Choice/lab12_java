abstract class payment {
	protected int is_succeed;
	public payment(int a) {
        is_succeed = a;
    }
    public abstract int is_accessible();
}