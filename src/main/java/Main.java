import org.argennon.csgot.CsGoTranspiler;

import java.io.File;
import java.io.IOException;


public class Main {
    static StringBasedReporter reporter = new StringBasedReporter();

    public static void main(String[] args) throws IOException {
        var src = new File(args[0]);
        var output = new File(args[1]);
        transpileDir(src, output);
    }

    public static void transpileDir(File srcDir, File dstDir) throws IOException {
        var files = srcDir.listFiles();
        if (files == null) throw new IOException(srcDir + " is not a valid directory");

        for (File f : files) {
            if (f.isDirectory()) {
                transpileDir(f, new File(dstDir, f.getName()));
            } else if (f.isFile() && f.getName().endsWith(".csgo")) {
                var transpiler = new CsGoTranspiler(reporter);
                transpiler.transpileFile(
                        f,
                        new File(dstDir, f.getName().replace(".csgo", ".go"))
                );
            }
        }
    }
}