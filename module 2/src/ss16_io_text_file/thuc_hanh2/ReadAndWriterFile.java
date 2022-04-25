package ss16_io_text_file.thuc_hanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriterFile {
    public List<Integer>readFile(String filePath){
        List<Integer>numbers= new ArrayList<>();
        try {
            File file= new File(filePath);
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br= new BufferedReader(new FileReader(file));
            String line = "";
//            while (true){
//                line= br.readLine();
//                if (line==null){
//                   break;
//                }
//                numbers.add(Integer.parseInt(line));
//                br.close();
//            }
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.out.println("is not a file");
        }
        return numbers;
    }
    public void writerFile(String filePath,int max){
        try {
            FileWriter fileWriter= new FileWriter(filePath,true);
            BufferedWriter bW= new BufferedWriter(fileWriter);
            bW.write("max= "+max);
            bW.close();

        }catch (IOException ie){
            ie.printStackTrace();
        }

    }
}
