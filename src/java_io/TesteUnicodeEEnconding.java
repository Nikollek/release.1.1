package src.java_io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEnconding {
    public static void main(String[] args) throws UnsupportedEncodingException, UnsupportedEncodingException {

        String s = "ç";
        System.out.println(s.codePointAt(0)); //unicode

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = s.getBytes("UTF-8");
        System.out.print(bytes.length + ", UTF-8, ");
        //recebendo então o bytes no constutor do String
        //conversão de binario para o caractere que ele representa.
        String sNovo = new String(bytes, "UTF-8");
        System.out.println(sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.print(bytes.length + ", UTF-16, ");
        sNovo = new String(bytes, "UTF-16");
        System.out.println(sNovo);


        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.print(bytes.length + ", US-ASCII, ");
        sNovo = new String(bytes, "US-ASCII");
        System.out.println(sNovo);

    }
}