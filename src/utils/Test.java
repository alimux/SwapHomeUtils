
package utils;

/**
 * class Test Utils
 * @author Alexandre DUCREUX & Logan LEPAGE
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int month =12;
        
        Utils u = new Utils();
        if(u.isValid(month)){
            System.out.println("mois valide : "+month+" : "+u.isValid(month));
        }
        else{
            System.out.println("mois non valide");
        }
        
        u.getMonthList().get(2);
        
        MonthsList[] monthsList = MonthsList.values();
        int valuesNumber = monthsList.length;
        for(MonthsList name : monthsList){
            System.out.println("test enum values :"+name.getMonth());
        }
        
        for(int i=0;i<Utils.getMonthList().size();i++){
            System.out.println("test AL values :"+Utils.getMonthList().get(i));
        }
        
        for(int i=0;i<Utils.getCountriesList().size();i++){
            System.out.println("test countries name index : "+Utils.getCountriesList().get(i).EN);
        }
        
    }
    
}
