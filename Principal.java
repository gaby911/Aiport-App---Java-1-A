import java.util.*;

public class Principal{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Aeroport aeroport = Aeroport.getInstance();
        System.out.println("Introduceti comanda: ");
        
        while(true){
        String s = sc.nextLine();
        String [] pos = s.trim().split("\\s++");
        
        switch(pos[0]){
            case "exit":
                aeroport.exit();
            break;
            case "afisare":
                aeroport.afisare();
            break;
            case "afisareCurseExterne":
                aeroport.afisareCurseExterne();
            break;
            case "adaugaCursaInterna":
                int pret = Integer.parseInt(pos[1]);
                int nrPasageri = Integer.parseInt(pos[2]);
                String destinatie = pos[3];
                boolean escala=Boolean.parseBoolean(pos[4]);
                aeroport.adaugaCursaInterna(pret,nrPasageri,destinatie,escala);
            break;
            case "adaugaCursaExterna":
                int pret1 = Integer.parseInt(pos[1]);
                int nrPasageri1 = Integer.parseInt(pos[2]);
                String destinatie1 = pos[3];
                boolean escala1=Boolean.parseBoolean(pos[4]);
                String taraLinieAeriana = pos[5];
                aeroport.adaugaCursaExterna(pret1,nrPasageri1,destinatie1,escala1,taraLinieAeriana);
            break;
        }
        
        
        }
        
    }
}