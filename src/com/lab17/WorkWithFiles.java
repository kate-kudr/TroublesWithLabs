package com.lab17;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("file17.txt");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        File file = new File(String.valueOf(path));
        file.createNewFile();

        FileWriter fw = new FileWriter(file);
        FileReader fr = new FileReader(file);

        try {
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(str);
            bw.close();
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }

        try {
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());
            br.close();
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }

        String str1 = scanner.nextLine();

        try {
            FileWriter fw1 = new FileWriter(file);
            fw1.write(str1);
            fw1.close();
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }

        try {
            BufferedWriter bw1 = new BufferedWriter(new FileWriter(file, true));
            bw1.write("\nzxcvbn");
            bw1.close();
        } catch (IOException e) {
            System.out.println("error " + e.getMessage());
        }
    }
}
