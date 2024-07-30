package WEEK_1.Design_Patterns_And_Principles.Exercise3.BuilderPatternExample;

//import java.lang.module.ModuleDescriptor.Builder;

public class Computer {
   private String CPU;
   private String RAM;
   private String Storage;
   private Computer(Builder builder){
    this.CPU = builder.CPU;
    this.RAM = builder.RAM;
    this.Storage = builder.Storage;
   }
   public String getCPU(){
    return CPU;
   }
   public String getRAM(){
    return RAM;
    }
    public String getStorage(){
        return Storage;
        }
        public static class Builder{
            private String CPU;
            private String RAM;
            private String Storage;
            public Builder setCPU(String CPU){
                this.CPU=CPU;
                return this;
            }
            public Builder setRAM(String RAM){
                this.RAM=RAM;
                return this;
            }
            public Builder setStorage(String Storage){
                this.Storage=Storage;
                return this;
            }
            public Computer build(){
                return new Computer(this);
            } 
        }   
            public String toString() {
                return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + Storage + "]";
            
        }
}
