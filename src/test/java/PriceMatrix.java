import java.math.BigDecimal;


public interface PriceMatrix {

	public BigDecimal lookupPrice(String item);
}
