package cn.jxufe.soft;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Problem2  {
    public static void main(String[] args) {
        // 指定文件路径
        String filePath = "D:\\IDEA\\JAVA\\MyFolder\\myFile1.txt";

        // 统计大写字母 'T' 的次数
        int count = countUpperCaseT(filePath);

        System.out.println("The count of uppercase 'T' in the file is: " + count);
    }

    private static int countUpperCaseT(String filePath) {
        int count = 0;

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            count = lines.flatMapToInt(String::chars)
                    .filter(c -> c == 'T')
                    .sum();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return count;
    }
}
