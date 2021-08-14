public class Main {
    
    public static void main(String[] args) {
        EngineSearch engineSearch = new EngineSearch();
        EngineSpec engineSpec =  engineSearch.search("D1800");
        engineSpec.display();
        
    }
}
