class payment_cash extends payment implements Cloneable {
	public payment_cash(int a) {
		super(a);
    }
	public Object clone() {
		try {
			return (payment_cash)super.clone();
		}
		catch(CloneNotSupportedException e) {
			 
		}
		return this;
	}
	public String toString() {
		return "Access code: " + is_succeed + "\n";
	}
	public void change_val(int a) {
		is_succeed = a;
	}
    public int is_accessible() {
        return is_succeed * 1;
    }
}