package io.github.tuizim.Dependency_Injection.kabum.configuration;

import io.github.tuizim.Dependency_Injection.kabum.Cpu;
import io.github.tuizim.Dependency_Injection.kabum.CpuBrand;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComputerConfiguration {

    @Bean
    public Cpu cpu(){
        return new Cpu(CpuBrand.INTEL,20,7);
    }
    @Bean
    public Cpu cpu2(){
        return new Cpu(CpuBrand.AMD,24,9);
    }
}
