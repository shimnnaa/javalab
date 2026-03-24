class CPU {
    int price;

    class Processor {
        int noOfCores;
        String manufacturer;

        Processor(int noOfCores, String manufacturer) {
            this.noOfCores = noOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessor() {
            System.out.println("Processor Cores: " + noOfCores);
            System.out.println("Processor Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAM() {
            System.out.println("RAM Memory: " + memory + "GB");
            System.out.println("RAM Manufacturer: " + manufacturer);
        }
    }
}

public class prgm09 {
    public static void main(String[] args) {

        CPU cpu = new CPU();
        cpu.price = 25000;

        CPU.Processor processor = cpu.new Processor(8, "Intel");
        CPU.RAM ram = new CPU.RAM(16, "Kingston");

        System.out.println("CPU Price: " + cpu.price);
        processor.displayProcessor();
        ram.displayRAM();
    }
}
