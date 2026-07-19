import java.io.*;
import java.util.Properties;

public class JavaIO {

    public void inputStreamRead() throws Exception {
        System.out.println("Read Using InputStream:");
        FileInputStream fis = new FileInputStream("input.txt");
        int ch;
        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }
        fis.close();
        System.out.println();
    }

    public void outputStreamWrite() throws Exception {
        System.out.println("Write Using OutputStream:");
        FileOutputStream fos = new FileOutputStream("output.txt");
        fos.write("Hello Java".getBytes());
        fos.close();
        System.out.println("Data Written");
    }

    public void bufferedInputStreamRead() throws Exception {
        System.out.println("Read Using BufferedInputStream:");
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("input.txt"));
        int ch;
        while ((ch = bis.read()) != -1) {
            System.out.print((char) ch);
        }
        bis.close();
        System.out.println();
    }

    public void bufferedOutputStreamWrite() throws Exception {
        System.out.println("Write Using BufferedOutputStream:");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffer.txt"));
        bos.write("Buffered Output".getBytes());
        bos.close();
        System.out.println("Data Written");
    }

    public void fileReaderRead() throws Exception {
        System.out.println("Read Using FileReader:");
        FileReader fr = new FileReader("input.txt");
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }
        fr.close();
        System.out.println();
    }

    public void fileWriterWrite() throws Exception {
        System.out.println("Write Using FileWriter:");
        FileWriter fw = new FileWriter("writer.txt");
        fw.write("Hello FileWriter");
        fw.close();
        System.out.println("Data Written");
    }

    public void bufferedReaderRead() throws Exception {
        System.out.println("Read Using BufferedReader:");
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

    public void bufferedWriterWrite() throws Exception {
        System.out.println("Write Using BufferedWriter:");
        BufferedWriter bw = new BufferedWriter(new FileWriter("bufferwriter.txt"));
        bw.write("Hello BufferedWriter");
        bw.close();
        System.out.println("Data Written");
    }

    public void propertiesRead() throws Exception {
        System.out.println("Read Properties File:");
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        p.load(fis);
        System.out.println("Username: " + p.getProperty("username"));
        System.out.println("Password: " + p.getProperty("password"));
        fis.close();
    }

    public static void main(String[] args) throws Exception {

        FileHandlingPrograms obj = new FileHandlingPrograms();

        obj.outputStreamWrite();

        obj.inputStreamRead();

        obj.bufferedOutputStreamWrite();

        obj.bufferedInputStreamRead();

        obj.fileWriterWrite();

        obj.fileReaderRead();

        obj.bufferedWriterWrite();

        obj.bufferedReaderRead();

        obj.propertiesRead();
    }
}
