import java.math.BigDecimal;

public class SezonskiZaposlenik extends Zaposlenik {

    public SezonskiZaposlenik(String ime, BigDecimal placa, Double brojRadnihSati) {
        super(ime, placa, brojRadnihSati);
    }

    @Override
    public BigDecimal izracunPlace() {

        if (getBrojRadnihSati() > 200) {
            BigDecimal bonus = getPlaca().multiply(BigDecimal.valueOf(0.10));
            setPlaca(getPlaca().add(bonus));

        }
        return getPlaca();
    }
}
