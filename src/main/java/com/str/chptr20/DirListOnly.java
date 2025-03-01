package main.java.com.str.chptr20;
import java.io.*;

class DirListOnly {
    public static class OnlyExt implements FilenameFilter {
        String ext;

        public OnlyExt(String ext) {
            this.ext = "." + ext;
        }

        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("html");
        String s[] = f1.list(only);

        for (int i=0; i<s.length; i++) {
            System.out.println(s[i]);
        }
    }

}

