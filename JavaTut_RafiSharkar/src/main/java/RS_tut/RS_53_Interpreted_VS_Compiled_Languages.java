package RS_tut;

/*
Interpreter vs Compiler__
==> Interpreter translates one statement at a time into machine code.   (line by line)
==> Compiler scans the entire program and translates whole of it into machine code. (program by program)

Interpreter                                                                                                        Compiler
* One statement at a time.                                                                                  * Entire program at a time
* Interpreter is needed everytime.(if you want to run any interpreted code like      * Once compiled it is not needed.(when c++ file compiled and generate a .exe file then .exe file don't need
   python then you need interpreter)                                                                       any compiler like gcc for c/c++)
* Partial execution if error(total code is 90 line and error at 67th line then           * No execution if an error occurs at anywhere in program.
   interpreter run 1-66 code and throw error after 67 line)
* Usually easy for programmer and run slower than compiler                                * Usually not as easy for programmer and run faster than interpreter Ex: C, C++
   Ex: JavaScript, Python


What about java?
--> Java is hybrid (combination of both)

        [filename.java]  --(compiled using javac)-->  [filename.class( byte code )]  --(can be used by java interpreter)--
   --> A JVM(Java virtual machine) can be used to interpret this bytecode.
   --> This bytecode can be taken to any platform(win/mac/linux)
   --> Hence Java is platform independent (write once run everywhere)

   ### in intellij it maintain all.



 */

public class RS_53_Interpreted_VS_Compiled_Languages {
    public static void main(String[] args) {
        System.out.println("Java is hybrid");
    }
}
