import java.math.BigDecimal;

public class StedniRacun extends Racun{

    private BigDecimal kamateNaStednju;

    public StedniRacun(BigDecimal stanje) {
        super(stanje);
    }
    BigDecimal getKamateNaStednju(){
        BigDecimal kamateNaStednju = stanje + kamateNaStednju;
        return kamateNaStednju;

    }

}
