package cpu.old;

import cpu.CPU;
import cpu.Parser;

@Deprecated
public class CPU_Demo {
    public static cpu.CPU CPU = new CPU();
    public static Debugger debugger = new Debugger();
    public static void main(String[] args) {
	// write your code here
        Parser paraser = new Parser();

      //  try {
//            paraser.parseFile();
             //paraser.loadToMemory();
             //Debugger.writeDebugFile(paraser.loadToMemory());
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
    }


    public static CPU getCPU(){
        return CPU;
    }
    public static Debugger getDebugger(){return debugger;}
}
