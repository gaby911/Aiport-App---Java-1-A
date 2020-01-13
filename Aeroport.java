import java.util.*;

public class Aeroport {
    private static Aeroport SINGLETON;
    
    public List<Curse> lista;
    
    private Aeroport (){
        lista=new ArrayList<Curse>();
    }
    
    public static final Aeroport getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Aeroport();
        }
        
        return SINGLETON;
    }
    
    public void adaugaCursaInterna(int pret, int nrPasageri, String destinatie, boolean escala){
        if(lista.size() <=30){
        Interne i = new Interne(pret,nrPasageri,destinatie,escala);
        lista.add(i);
        System.out.println("S-a adaugat o cursa interna");
       }else{
           throw new PreaMulteCurseException();
        }
    }
    
    public void adaugaCursaExterna(int pret, int nrPasageri, String destinatie, boolean escala, String taraLinieAeriana){
        if(lista.size() <=30){
        Externe e = new Externe(pret,nrPasageri,destinatie,escala,taraLinieAeriana);
        lista.add(e);
        System.out.println("S-a adaugat o cursa externa");
       }else{
           throw new PreaMulteCurseException();
        }
    }
    
    public void exit(){
        System.exit(0);
    }
    
    public void afisare(){
        lista.forEach(System.out::println);
    }
    
    public void afisareCurseExterne(){
        for(Curse c: lista){
            if(c instanceof Externe){
                System.out.println(c);
            }
        }
    }
    
    
}