class payment_cash extends payment {
	public payment_cash(int a) {
		super(a);
    }
    public int is_accessible() {
        return is_succeed * 1;
    }
}