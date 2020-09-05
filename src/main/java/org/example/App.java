package org.example;

import java.io.*;

public class App {
    public static void main(String[] args) {
        File source = new File("src/main/java/org/example/source/plain.txt");
        File destination = new File("src/main/java/org/example/destination/copy_plain.txt");
        File destination2 = new File("src/main/java/org/example/destination/copy_plain2.txt");

        System.out.println(read(source));
        copy(source,destination);
        buffCopy(source,destination2);
    }

    public static void copy(File source, File destination) {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void buffCopy(File source, File destination) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
            byte[] buffer = new byte[1024]; //Defining a buffer
            int bytesRead;

            while ((bytesRead = in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesRead);
                out.flush();         // Forcing a write after each iteration
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String read(File source) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileReader reader = new FileReader(source)) {
            int i;
            while ((i = reader.read()) != -1) {
                char letter = (char) i;
                stringBuilder.append(letter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}




