package main.java.com.str.chptr21;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
//import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {
        FileInputStream fIn = null;
        FileChannel fChan = null;
        long fSize;
        MappedByteBuffer mBuf;

        try {
            //сначала открыть файл для ввода
            fIn = new FileInputStream("test.txt");
            //затем получить канал к этому файлу
            fChan = fIn.getChannel();
            //получить размер файла
            fSize = fChan.size();
            //а теперь сопоставить файл с буфером
            mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            //читать байты из буфера и вывоить их на жкран
            for (int i=0; i<fSize; i++)
            System.out.println((char)mBuf.get());
        } catch (IOException e) {
            System.out.println("Ошибка ввода выода " + e);
        } finally {
            try {
                if (fChan != null) fChan.close(); //закрыть канал
            } catch ( IOException e) {
                System.out.println("Ошибка закрытия канала " + e);
            }
        } try {
            if(fIn != null) fIn.close();
        }catch (IOException e) {
            System.out.println("Ощибка закрытия файла");
        }


//        //получить канал к файлу в блоке оператора try с ресурса
//        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("test.txt"))){
//            //получить размер файла
//            long fSize = fChan.size();
//            //сопоставить файл с буфером
//            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
//
//            //читать байты из буфера и выводить их на экран
//            for (int i = 0; i < fSize; i++)
//                System.out.println((char)mBuf.get());
//            System.out.println();
//
//        } catch (InvalidPathException e) {
//            System.out.println("Ощибка указания пути " + e);
//        } catch (IOException e) {
//            System.out.println("Ошибка ввода-вывода " + e);
//        }
    }
}
