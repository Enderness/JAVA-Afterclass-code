import java.io.File;
import java.io.IOException;



public class CreateAndDeletet{
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:/IDEA/2.txt");
        if (file1.createNewFile()) {
            System.out.println("创建文件成功");
        } else {
            System.out.println("创建文件失败");
        }

        if (file1.delete()) {
            System.out.println("删除文件成功");
        } else {
            System.out.println("删除文件失败");
        }


    }
}
