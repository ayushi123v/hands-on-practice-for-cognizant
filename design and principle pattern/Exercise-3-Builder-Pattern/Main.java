public class Main {

    public static void main(String[] args) {

        computer gamingPC = new computer.Builder()
                .setCpu("Intel i9")
                .setRam(32)
                .setStorage(1000)
                .setGraphicsCard("RTX 4090")
                .setOperatingSystem("Windows 11")
                .build();

        gamingPC.display();

        System.out.println();

        computer officePC = new computer.Builder()
                .setCpu("Intel i5")
                .setRam(16)
                .setStorage(512)
                .setOperatingSystem("Windows 10")
                .build();

        officePC.display();
    }
}
