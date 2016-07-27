package Fifth;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class MyZip {
    private void zip(String zipFilename, File inputFile) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zipFilename));
        zip(zos, inputFile, "");
        System.out.println("ziping ...");
        zos.close();
    }

    private void zip(ZipOutputStream zos, File file, String base) throws IOException {
        if(file.isDirectory()) {
            File[] fileOne = file.listFiles();
            zos.putNextEntry(new ZipEntry(base + "/"));
            base = base.length() == 0 ? "" : base + "/";
            for(int i = 0; i < fileOne.length; i++) {
                zip(zos, fileOne[i], base + fileOne[i]);
            }
        } else {
            zos.putNextEntry(new ZipEntry(base));
            FileInputStream fis = new FileInputStream(file);
            int b;
            System.out.println(base);
            while((b = fis.read()) != -1) {
                zos.write(b);
            }
            fis.close();
        }
    }

    public static void main(String[] args) {
        MyZip mz = new MyZip();
        try {
            mz.zip("word.zip", new File("word.txt"));
            System.out.println("zip completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        ZipInputStream zis;
        try {
            zis = new ZipInputStream(new FileInputStream("word.zip"));
            ZipEntry ze = zis.getNextEntry();
            System.out.println("Completed All" + ze.getName());
            while(((ze = zis.getNextEntry()) != null) && !ze.isDirectory()) {
                File file = new File("d:\\" + ze.getName());
                System.out.println(file);
                if(!file.exists()) {
                    file.mkdirs();
                    file.createNewFile();
                }
                zis.closeEntry();
                System.out.println(ze.getName() + "unzip successed");
            }
            zis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Completed All");
    }
}
