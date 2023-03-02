import org.argennon.csgot.CsGoTranspiler;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        var reporter = new StringBasedReporter();
        var transpiler = new CsGoTranspiler(reporter);
        File csgoSrc = new File("files/test.csgo");
        System.out.println(csgoSrc.canRead());
        System.out.println(csgoSrc.getAbsolutePath());
        File goTarget = new File("files/test.go");
        transpiler.transpileFile(csgoSrc, goTarget);
    }
}