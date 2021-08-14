public class EngineSpec {
    private String source;
    private String model;
    private int displacement;
    private int maxPowerInKM;
    private int maxRPM;
    private int maxTorqueInNM;
    private int weight;
    private int cylinders;
    private String compRatio;
    private String currentType;
    private String voltage;

    public EngineSpec(){

    }

    public EngineSpec(String source,String model, int displacement, int maxPowerInKM, int maxRPM, int maxTorqueInNM, int weight,String compRatio,String currentType,
            int cylinders,String voltage) {
        this.model = model;
        this.displacement = displacement;
        this.maxPowerInKM = maxPowerInKM;
        this.maxRPM = maxRPM;
        this.maxTorqueInNM = maxTorqueInNM;
        this.weight = weight;
        this.cylinders = cylinders;
        this.compRatio = compRatio;
        this.currentType = currentType;
        this.voltage = voltage;
        this.source = source;
    }
    public String getCompRatio() {
        return compRatio;
    }
    public void setCompRatio(String compRatio) {
        this.compRatio = compRatio;
    }
    public String getCurrentType() {
        return currentType;
    }
    public void setCurrentType(String currentType) {
        this.currentType = currentType;
    }
    public String getVoltage() {
        return voltage;
    }
    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getDisplacement() {
        return displacement;
    }
    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }
    public int getMaxPowerInKM() {
        return maxPowerInKM;
    }
    public void setMaxPowerInKM(int maxPowerInKM) {
        this.maxPowerInKM = maxPowerInKM;
    }
    public int getMaxRPM() {
        return maxRPM;
    }
    public void setMaxRPM(int maxRPM) {
        this.maxRPM = maxRPM;
    }
    public int getMaxTorqueInNM() {
        return maxTorqueInNM;
    }
    public void setMaxTorqueInNM(int maxTorqueInNM) {
        this.maxTorqueInNM = maxTorqueInNM;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getCylinders() {
        return cylinders;
    }
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public void display(){
        System.out.println("Engine Power Source : "+source);
        System.out.println("Engine Model Number : "+model);
        System.out.println("Displacement        : "+displacement+" cc");
        System.out.println("Max Power           : "+maxPowerInKM+" kW");
        System.out.println("Max RPM             : "+maxRPM);
        System.out.println("Max Torque          : "+maxTorqueInNM+" Nm");
        System.out.println("Weight              : "+weight+" kgs");
        System.out.println("Number Of Cylinder  : "+cylinders);
        System.out.println("Compression Ratio   : "+compRatio);
    }

}