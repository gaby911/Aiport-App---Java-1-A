public class Interne extends Curse{
    Interne(int pret, int nrPasageri, String destinatie, boolean escala){
        super(pret, nrPasageri,destinatie,escala);
        discountPretInterne();
    }
    
    public void discountPretInterne(){
        if (this.isEscala() ==true){
            this.setPret(this.getPret() + 15/100 * this.getPret());
        }
    }
    
    @Override 
    public String toString(){
        return "Cursa: " + this.getPret() + " " + this.getNrPasageri() +
        " " + this.getDestinatie()+ " " + this.isEscala();
    }
}