package BuilderVsFactory.Builder;

import FluentBuilder.Computer;
import FluentBuilder.ComputerIntent;
import FluentBuilder.ComputerType;

public class OfficePCBuilder {
    private Computer.ComputerBuilder builder;

    public OfficePCBuilder(){
        this.builder = new Computer.ComputerBuilder();
    }

    private void buildComputer() {
        builder.computerType(ComputerType.PC);
        builder.computerIntent(ComputerIntent.OFFICE);
        builder.processor("Intel Core i3-8100");
        builder.ramInGB(8);
        builder.ssdInGB(256);
    }

    public Computer getPCOfficeComputer(){
        buildComputer();
        return builder.build();
    }
}
