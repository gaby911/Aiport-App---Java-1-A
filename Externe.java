public class Externe extends Curse{
    private String taraLinieAeriana;
    
    Externe(int pret, int nrPasageri, String destinatie, 
    boolean escala, String taraLinieAeriana){
        super(pret, nrPasageri,destinatie,escala);
        this.taraLinieAeriana=taraLinieAeriana;
        discountPretExterne();
    }
    
    public String getTara(){
        return this.taraLinieAeriana;
    }
    
    public void setTara(String taraLinieAeriana){
        this.taraLinieAeriana=taraLinieAeriana;
    }
    
    public void discountPretExterne(){
        if (this.isEscala() ==false){
        this.setPret(this.getPret() - 10/100 * this.getPret());
       }
    }
    
    @Override 
    public String toString(){
        return "Cursa: " + this.getPret() + " " + this.getNrPasageri() +
        " " + this.getDestinatie()+ " " + this.isEscala() + " "+
        this.getTara();
    }
}