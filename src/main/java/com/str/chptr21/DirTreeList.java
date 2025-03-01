package main.java.com.str.chptr21;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

//создать спец версию класса SimpleFileVisitor
//в которой переопредеяется метод visitFile()
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path path, BasicFileAttributes attribs)  throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";
        System.out.println("Дерево каталогов, начиная с каталога " + dirname + ":\n");

        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException exc) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
