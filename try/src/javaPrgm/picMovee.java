package javaPrgm;

/**
 *
 */


//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author smandloi2
 *
 */
public class picMovee {
    public static void main(String[] args) {

        String baseDirPath = "E:\\Pictures\\Papa Retirement party 07 Aug 2021";
        File baseDir = new File(baseDirPath);

        File[] getContents = baseDir.listFiles();
        int folderCount = 0;
        int fileCount = 0;
        for (File content : getContents) {

            folderCount++;
            if (content.isDirectory()) {
                File subDir = new File(baseDirPath + "\\" + content.getName());
                File[] getSubContents = subDir.listFiles();

                for (File subContent : getSubContents) {

                    /*try {
                        if (subContent.getName().contains("jpg")) {
                            fileCount++;
                            FileUtils.moveFileToDirectory(subContent, baseDir, false);
                            System.out.println("File - " + subContent.getName() + "Moved");
                        }
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }*/
                }
                System.out.println("Folder - " + content.getName() + "Processed");
            }

        }
        System.out.println("Total Folder : " + folderCount);
        System.out.println("Total File : " + fileCount);

    }
}

