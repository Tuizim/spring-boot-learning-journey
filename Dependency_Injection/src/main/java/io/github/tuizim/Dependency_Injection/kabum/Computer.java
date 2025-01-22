package io.github.tuizim.Dependency_Injection.kabum;

public class Computer {
    private GpuType gpu;
    private Cpu cpu;
    private int memory;
    private MemoryType memoryType;
    private Double amount;

    public Computer(Cpu cpu) {
        this.cpu = cpu;
    }

    public GpuType getGpu() {
        return gpu;
    }

    public void setGpu(GpuType gpu) {
        this.gpu = gpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public MemoryType getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(MemoryType memoryType) {
        this.memoryType = memoryType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Cpu getCpu() {
        return cpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "gpu=" + gpu +
                ", cpu=" + cpu +
                ", memory=" + memory +
                ", memoryType=" + memoryType +
                ", amount=" + amount +
                '}';
    }
}
