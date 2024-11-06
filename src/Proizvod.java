
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Proizvod {

    private final String naziv;
    private final BigDecimal cijena;
    private BigDecimal popust;

    public Proizvod(String naziv, BigDecimal cijena) {
        this.naziv = naziv;
        this.cijena = cijena;
    }

    public void postaviPopust(BigDecimal popust) {
        this.popust = popust;
    }

    public BigDecimal izracunajCijenu() {
        BigDecimal iznosPopusta = cijena.multiply(popust).divide(BigDecimal.valueOf(100), RoundingMode.HALF_DOWN);
        return cijena.subtract(iznosPopusta);

    }
}
