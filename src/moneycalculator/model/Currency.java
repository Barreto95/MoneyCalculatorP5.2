package moneycalculator.model;

public class Currency {
    private final String abreviacion;
    private final String divisa;
    private final String cantidad;

    public Currency(String abreviacion, String divisa, String cantidad) {
        this.abreviacion = abreviacion;
        this.divisa = divisa;
        this.cantidad = cantidad;
    }

    public String getAbreviacion() {
        return abreviacion;
    }

    public String getDivisa() {
        return divisa;
    }

    public String getCantidad() {
        return cantidad;
    }
    
    
}
