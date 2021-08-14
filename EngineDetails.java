public class EngineDetails {
    private static EngineSpec[] petrol;
    private static EngineSpec[] diesel;
    private static EngineSpec[] cng ;
    private static EngineSpec[] electric;
    
    

    static{
        petrol = new EngineSpec[]{
                    new EngineSpec("Petrol","P1000", 996, 50, 6000, 90, 75, "11.0:1", "NA", 3, "NA"),
                    new EngineSpec("Petrol","P1500", 1498, 88, 6500, 155, 93, "10.3:1", "NA", 4, "NA"),
                    new EngineSpec("Petrol","P2000", 1992, 118, 6500, 220, 125, "12.0:1", "NA", 4, "NA"),
                    new EngineSpec("Petrol","P2400", 2396, 138, 6900, 340, 140, "10.5:1", "NA", 6, "NA"),
                };
        diesel = new EngineSpec[]{
                    new EngineSpec("Diesel","D1300", 1248, 67, 6000, 200, 111, "17.6:1", "NA", 4, "NA"),
                    new EngineSpec("Diesel","D1800", 1796, 103, 6300, 170, 141, "10.5:1", "NA", 4, "NA"),
                    new EngineSpec("Diesel","D2400", 2384, 136, 7000, 233, 152, "11.2:1", "NA", 4, "NA"),
                };
        cng = new EngineSpec[]{
                    new EngineSpec("CNG","C1000", 998, 43, 6000, 78, 75, "11.0:1", "NA", 3, "NA"),
                    new EngineSpec("CNG","C1500", 1498, 69, 6500, 122, 93, "10.5:1", "NA", 4, "NA")
                };
        electric = new EngineSpec[]{
                    new EngineSpec("Electric","88", 0, 88, 150000, 220, 45, "NA", "AC", 0, "360")
                };
    }
    public static EngineSpec[] getPetrolDetals(){
        return petrol;
    }
    public static EngineSpec[] getDieselDetails(){
        return diesel;
    }
    public static EngineSpec[] getcngDetails(){
        return cng;
    }
    public static EngineSpec[] getElectricDetails(){
        return electric;
    }
}
