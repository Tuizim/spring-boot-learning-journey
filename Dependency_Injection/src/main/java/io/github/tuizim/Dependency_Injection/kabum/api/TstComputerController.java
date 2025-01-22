package io.github.tuizim.Dependency_Injection.kabum.api;

import io.github.tuizim.Dependency_Injection.kabum.Computer;
import io.github.tuizim.Dependency_Injection.kabum.Cpu;
import io.github.tuizim.Dependency_Injection.kabum.PersonalComputerGamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/computer")
public class TstComputerController {

    @Autowired
    private Cpu cpu2;

    @GetMapping
    public Computer getPc(){
        return new PersonalComputerGamer(cpu2);
    }
}
