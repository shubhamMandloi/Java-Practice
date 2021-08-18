package javaPrgm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DupFiles {

    public static void main(String[] args) {
        String baseDirPath = "E:\\Pictures";
        String[] extensions = {"png", "jpg", "jpeg", "mp4", "3gp", "mov", "dng"};


        try {
            HashMap<String, String> uniqueFileMap = new HashMap<>();
            HashMap<String, String> dupFileMap = new HashMap<>();
            List<String> fileList = new ArrayList<>();

            List<String> files = findFiles(Paths.get(baseDirPath), extensions);
            files.forEach(x -> fileList.add(x));
           /* System.out.println(fileList.size());
            fileList.forEach(x -> System.out.println(x));*/

            for (String filePath : fileList) {
                String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1);
                String folderName = filePath.substring(0, filePath.lastIndexOf("\\"));
                if (uniqueFileMap.containsKey(fileName)) {
                    if(Files.size(Path.of(uniqueFileMap.get(fileName)+"\\"+fileName))==Files.size(Path.of(filePath))) {
                        dupFileMap.put(fileName,
                                uniqueFileMap.get(fileName) +  ", "
                                        + folderName + " size :\\" + Files.size(Path.of(filePath)) / 1024 +
                                        dupFileMap.getOrDefault("," + fileName, ""));
                    }

                } else
                    uniqueFileMap.put(fileName, folderName);


            }
            System.out.println("Unique file size : " + uniqueFileMap.size());
            System.out.println("Duplicate file size : " + dupFileMap.size());
            dupFileMap.forEach((k, v) -> System.out.println("Duplicate  file :   " + k + " and folder is " + v));


        } catch (
                IOException e) {
            e.printStackTrace();
        }


    }

    public static List<String> findFiles(Path path, String[] fileExtensions) throws IOException {

        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("Path must be a directory!");
        }

        List<String> result;
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk
                    .filter(p -> !Files.isDirectory(p))
                    // convert path to string
                    .map(p -> p.toString().toLowerCase())
                    .filter(f -> isEndWith(f, fileExtensions))
                    .collect(Collectors.toList());
        }
        return result;

    }

    private static boolean isEndWith(String file, String[] fileExtensions) {
        boolean result = false;
        for (String fileExtension : fileExtensions) {
            if (file.endsWith(fileExtension)) {
                result = true;
                break;
            }
        }
        return result;
    }

}
