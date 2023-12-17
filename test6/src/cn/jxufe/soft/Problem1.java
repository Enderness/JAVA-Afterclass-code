package cn.jxufe.soft;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class  Problem1 {
    public static void main(String[] args) {
        // 指定文件夹路径
        String folderPath = "MyFolder";

        // 使用File类的构造函数创建文件夹
        File folder = new File("D:", "MyFolder");

        // 检查文件夹是否存在，如果不存在则创建
        if (!folder.exists()) {
            boolean created = folder.mkdirs();

            if (created) {
                System.out.println("Folder created successfully.");
            } else {
                System.err.println("Failed to create folder.");
                return;
            }
        } else {
            System.out.println("Folder already exists.");
        }

        // 创建File对象表示文件
        File file = new File(folder, "myFile1.txt");

        // 检查文件是否存在，如果不存在则创建
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();

                if (created) {
                    System.out.println("File created successfully.");

                    // 随机写入1000个大小写字母，每20个字母换行
                    writeRandomLettersToFile(file, 1000, 20);

                    // 打印文件内容
                    printFileContent(file);
                } else {
                    System.err.println("Failed to create file.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File already exists.");

            // 打印文件内容
            printFileContent(file);
        }
    }

    private static void writeRandomLettersToFile(File file, int count, int lettersPerLine) {
        try (FileWriter writer = new FileWriter(file)) {
            Random random = new Random();
            for (int i = 0; i < count; i++) {
                char letter = (char) (random.nextInt(26) + 'A');
                writer.write(letter);


                if ((i + 1) % lettersPerLine == 0) {
                    writer.write(System.lineSeparator());
                }
            }
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFileContent(File file) {
        // 打印文件内容
        System.out.println("File content:");
        try {
            java.nio.file.Files.lines(file.toPath()).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
