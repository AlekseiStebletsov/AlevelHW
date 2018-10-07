public class Mobile {
    String model;
    String markCpu;
    Integer size;
    Integer camera;
    Integer sizeScreen;
    boolean CpuFrequency;
    boolean isExpensive;
    boolean isCompetitiveness;
    boolean isAccessToSocialNetwork;
    boolean isSmartphone;



    @Override
    public String toString() {
        String result = "{" +
                "model='" + model + '\'' +
                ", markCpu=" + markCpu +
                ", size=" + size +
                ", camera=" + camera +
                ", sizeScreen=" + sizeScreen;


        return result + '}';
    }

    public Mobile(String model, String markCpu, Integer size, Integer camera, Integer sizeScreen, boolean CpuFrequency, boolean isExpensive,
                  boolean isCompetitiveness, boolean isAccessToSocialNetwork, boolean isSmartphone) {
        this.model = model;
        this.markCpu = markCpu;
        this.size = size;
        this.camera = camera;
        this.sizeScreen = sizeScreen;
        this.CpuFrequency = CpuFrequency;
        this.isExpensive = isExpensive;
        this.isCompetitiveness = isCompetitiveness;
        this.isAccessToSocialNetwork = isAccessToSocialNetwork;
        this.isSmartphone = isSmartphone;

    }

    public static void main(String[] args) {
        Mobile Manufacturer = new Mobile("What models to produce", "what processor to put", null, null, null
                , true, true, true,
                false, true);
        Mobile User = new Mobile("Models", null, 5, 12, 5, false, true,
                false, true, true);
        Mobile[] users = {User};
        Mobile[] manuf ={Manufacturer};
        for (Mobile man:manuf
             ) {
            System.out.println("Manufacturer" + man);

        }
        for (Mobile mobile : users) {
            System.out.println("User" + mobile);

        }
    }


}
