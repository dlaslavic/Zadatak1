import java.math.BigDecimal;

public class TekuciRacun extends Racun {

    private double kamateNaTekuciRacun;

    public TekuciRacun(BigDecimal stanje, BigDecimal kamateNaTekuciRacun){
        super(stanje);

    }
    BigDecimal getKamateNaTekuciRacun() {
        BigDecimal kamateNaStednju = stanje + kamateNaTekuciRacun;
        return kamateNaTekuciRacun;
    }
}
