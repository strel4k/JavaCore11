package main.java.com.str.chptr21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
//import java.nio.file.*;

public class MappedChannelWrite {
    public static void main(String[] args) {
        RandomAccessFile fOut = null;
        FileChannel fChan = null;
        ByteBuffer mBuff;

        try {
            fOut = new RandomAccessFile("test.txt", "rw");

            //получить канал к открытому файлу
            fChan = fOut.getChannel();

            //затем сопоставить файл с буфером
            mBuff = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            //записать некоторое количество байт в буфер
            for(int i=0; i<26; i++)
                mBuff.put((byte) ('A' + i));
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода " + e);
        } finally {
            try {
                if (fChan != null) fChan.close(); // закрыть канал
            } catch (IOException e) {
                System.out.println("Ошиька закрытия канала.");
            }
            try {
                if (fOut != null) fOut.close(); //закрыть файл
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

//        //получить канал к файлу в блоке try с ресурсами
//        try (FileChannel fChan = (FileChannel)
//            Files.newByteChannel(Paths.get("test.txt"),
//                                StandardOpenOption.WRITE,
//                                StandardOpenOption.READ,
//                                StandardOpenOption.CREATE)) {
//            //сопоставить файл с буфером
//            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
//
//            //записать заданное количество байт в буфер
//            for (int i = 0; i < 26; i++)
//                mBuf.put((byte) ('A' + i));
//        } catch (InvalidPathException e) {
//            System.out.println("Ошибка указания пути " + e);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода " + e);
//        }
    }
}
