package compiler.IR;

public class MJDouble extends MJExpression {

	private double value;

	public MJDouble(String string) {
		this.value = Double.parseDouble(string);
	}

	public MJDouble(double slot) {
		this.value = slot;
	}

	public double getValue() {
		return value;
	}

}
