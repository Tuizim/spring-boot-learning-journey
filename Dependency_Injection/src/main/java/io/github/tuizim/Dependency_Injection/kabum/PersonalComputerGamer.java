package io.github.tuizim.Dependency_Injection.kabum;

public class PersonalComputerGamer extends Computer {
    public PersonalComputerGamer(Cpu cpu) {
        super(cpu);
        this.setGpu(GpuType.NVIDEA);
        this.setMemory(500);
        this.setMemoryType(MemoryType.SSD);
        this.setAmount(4500.00);
    }
}