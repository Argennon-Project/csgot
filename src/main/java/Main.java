import org.argennon.csgot.CsGoTranspiler;

import java.io.IOException;


public class Main {
    static StringBasedReporter reporter = new StringBasedReporter();

    public static void main(String[] args) throws IOException {
        String srcRoot = args[0];
        String outputRoot = args[1];
        var transpiler = new CsGoTranspiler(reporter);
        if (transpiler.transpileAll(srcRoot, outputRoot)) {
            System.out.println("All files successfully transpiled.");
        } else {
            System.out.println("Some files contain errors!");
        }
    }

}