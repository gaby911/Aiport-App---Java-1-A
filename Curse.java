public abstract class Curse{
    private int pret;
    private int nrPasageri;
    private String destinatie;
    private boolean escala;
    
    Curse(int pret, int nrPasageri, String destinatie, boolean escala){
        this.pret=pret;
        this.nrPasageri=nrPasageri;
        this.destinatie=destinatie;
        this.escala=escala;
    }
    
    public int getPret(){
        return this.pret;
    }
    
    public void setPret(int pret){
        this.pret=pret;
    }
    
    public int getNrPasageri(){
        return this.nrPasageri;
    }
    
    public void setNrPasageri(int nrPasageri){
        this.nrPasageri=nrPasageri;
    }
    
    public String getDestinatie(){
        return this.destinatie;
    }
    
    public void setDestinatie(String destinatie){
        this.destinatie=destinatie;
    }
    
    public boolean isEscala(){
        return this.escala;
    }
    
    public void setEscala(boolean escala){
        this.escala = escala;
    }
    
    
} 