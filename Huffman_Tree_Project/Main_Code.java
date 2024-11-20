import java.util.*;
import java.io.*;
import java.lang.*;

class Main_Code{
    public static final int CHAR_MAX=256;
    public static void main(String[] args) throws IOException {
        System.out.println("Huffman code for file");
        System.out.println();

        Scanner console=new Scanner(System.in);
        System.out.println("input file name");
        String infile=console.nextLine();
        System.out.println("code file name");
        String outfile=console.nextLine();

        FileInputStream input=new FileInputStream(infile);
        int[] count=new int[CHAR_MAX];
        int n=input.read();
        while(n!=-1)
        {
            count[n]++;
            n=input.read();
        }

        HuffmanTree t=new HuffmanTree(count);
        PrintStream output=new PrintStream(new File(outfile));
        t.write(output);
    }
}