package src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aksha
 */
import java.io.*;

public class Player {

    File f1 = new File("Rank.txt");
    File f2 = new File("Temp.txt");

    int rank(int m) {
        try {

            FileReader fr = new FileReader(f1);
            BufferedReader fbr = new BufferedReader(fr);

            FileWriter fw = new FileWriter(f2);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String s;
            int r = 0;
            int n = 41;
            int t = 0;

            while ((s = fbr.readLine()) != null) {
                n = Integer.parseInt(s);
                boolean p = true;

                if (n > m) {
                    r++;
                    pw.println(n);
                    t = n;
                } else if (m > n && m < t) {
                    pw.println(m);

                    pw.println(n);
                    t = n;
                    t = n;

                } else {
                    pw.println(n);
                    t = n;
                }

            }
            if (t > m) {
                pw.println(m);
            }
            //pw.println("hi");

            pw.close();
            bw.close();
            fw.close();
            fbr.close();
            fr.close();
            f1.delete();
            f2.renameTo(f1);
            return ++r;
        } catch (Exception e) {
        }
        return -1;
    }

    int number() {
        try {

            FileReader fr = new FileReader("num.txt");
            BufferedReader fbr = new BufferedReader(fr);

            FileWriter fw = new FileWriter("tempp.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            String s;
            int n = 0;
            n = Integer.parseInt(fbr.readLine());
            n += 1;
            pw.println(n);

            pw.close();
            bw.close();
            fw.close();
            fbr.close();
            fr.close();
            File f3 = new File("num.txt");
            File f4 = new File("tempp.txt");
            f3.delete();
            f4.renameTo(f3);
            return n;

        } catch (IOException e) {

        }
        return -1;

    }
}
