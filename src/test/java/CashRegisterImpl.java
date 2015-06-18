import java.math.BigDecimal;

public class CashRegisterImpl {

	private PriceMatrix priceMatrix;

	public BigDecimal calculateTotalPrice(ShoppingCart cart) {

		BigDecimal total = new BigDecimal("0.0");
		total = total.add(priceMatrix.lookupPrice("item 1"));

		return total;
	}

	public void setPriceMatrix(PriceMatrix priceMatrix) {
		this.priceMatrix = priceMatrix;
	}
	
}
