/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author Amanda
 */
public class main {

    ArrayList<Pessoa> Pessoas = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File arquivo = new File("arquivo.txt");
        if (!arquivo.exists()) {
            System.out.println("até aqui não foi criado um arquivo");
        }
        FileReader fr = new FileReader(arquivo);
        BufferedReader br = new BufferedReader(fr);
        while (br.ready()) {
            String linha = br.readLine();
            String[] padroes = linha.split(";");
            //            StringTokenizer t = new StringTokenizer(";");
            //            System.out.println(t.nextToken().toString());
            //            System.out.println(linha);
            //Não utilizei a String Tolkenizer
            for(String s : padroes){
                System.out.println(s);
            }
        }
        br.close();
        fr.close();

    }

}
