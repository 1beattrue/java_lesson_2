package shop;

public class Tester {
    // Задание 4
    public static void main(String[] args) {
        Shop computerShop = new Shop();
        computerShop.addComputer(new Computer(Processor.INTEL_PENTIUM, Memory._256GB));
        computerShop.addComputer(new Computer(Processor.INTEL_CORE_I5, Memory._1TB));
        computerShop.addComputer(new Computer(Processor.INTEL_PENTIUM, Memory._128GB));

        System.out.println(computerShop);

        System.out.println(computerShop.findComputersByMemory(Memory._128GB));
        System.out.println(computerShop.findComputersByProcessor(Processor.INTEL_PENTIUM));
    }
}
