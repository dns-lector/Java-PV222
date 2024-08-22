package itstep.learning.oop;

import java.util.Locale;

public class Pump
        extends Product
        implements Manual {

    int productivity;

    public Pump( String manufacturer, int productivity ) {
        super.setManufacturer( manufacturer );
        this.setProductivity( productivity );
    }

    @Override
    public String getCard() {
        return String.format(
                Locale.ROOT,
                "Pump: '%s', Productivity: %d l/h",
                super.getManufacturer(), this.getProductivity()
        );
    }

    public int getProductivity() {
        return productivity;
    }

    public void setProductivity( int productivity ) {
        this.productivity = productivity;
    }
}
