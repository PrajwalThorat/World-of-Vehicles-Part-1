public class EngineSearch {
    private EngineSpec[] petrol;
    private EngineSpec[] diesel;
    private EngineSpec[] cng ;
    private EngineSpec[] electric;

    public EngineSearch(){
        petrol = EngineDetails.getPetrolDetals();
        diesel = EngineDetails.getDieselDetails();
        cng = EngineDetails.getcngDetails();
        electric = EngineDetails.getElectricDetails();
    }

    public EngineSpec search(String model){
        for(EngineSpec petrols:petrol){
            if(petrols.getModel().equals(model)){
                return petrols;
            }
        }
        for(EngineSpec diesels:diesel){
            if(diesels.getModel().equals(model)){
                return diesels;
            }
        }
        for(EngineSpec cNG: cng){
            if(cNG.getModel().equals(model)){
                return cNG;
            }
        }
        for(EngineSpec electrics:electric){
            if(electrics.getModel().equals(model)){
                return electrics;
            }
        }
        return null;
    }
    // public void showSpecs(){
    //     EngineSpec engineSpec = new EngineSpec();
    //     engineSpec.display();

    // }
    
}
