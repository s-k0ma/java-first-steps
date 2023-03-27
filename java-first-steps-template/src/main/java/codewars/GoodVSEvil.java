package codewars;

/**
 *
 * @author sergei
 * task: https://www.codewars.com/kata/52761ee4cffbc69732000738
 */
public class GoodVSEvil {
    private String goodForces;
    private String evilForces;
    
    public GoodVSEvil(String goodForses, String evilForces){
        this.evilForces = evilForces;
        this.goodForces = goodForses;
    }
    
    public void battle(){
        if(goodPower(goodForces) > evilPower(evilForces)) System.out.println("Battle Result: Good triumphs over Evil");
        else if(goodPower(goodForces) < evilPower(evilForces)) System.out.println("Battle Result: Evil eradicates all trace of Good");
        else System.out.println("Battle Result: No victor on this battle field");
    }
    
    private int goodPower(String goodForces){        
        int worth[] = {1, 2, 3, 3, 4, 10};
        String units[] = goodForces.split(" ");
        int power = 0;
        for(int i = 0; i < units.length; i++){
            power += worth[i] * Integer.parseInt(units[i]);
        }
        return power;
    }
    
    private int evilPower(String evilForces){
        int worth[] = {1, 2, 2, 2, 3, 5, 10};
        String units[] = evilForces.split(" ");
        int power = 0;
        for(int i = 0; i < units.length; i++){
            power += worth[i] * Integer.parseInt(units[i]);
        }
        return power;
    }
}
