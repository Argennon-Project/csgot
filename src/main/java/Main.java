import org.argennon.csgot.CsGoTranspiler;

import java.io.File;
import java.io.IOException;


public class Main {
    static StringBasedReporter reporter = new StringBasedReporter();

    public static void main(String[] args) throws IOException {
        var src = new File(args[0]);
        var output = new File(args[1]);
        var transpiler = new CsGoTranspiler(reporter, args[0], args[1]);
        transpiler.transpileDir(src, output);
    }

}