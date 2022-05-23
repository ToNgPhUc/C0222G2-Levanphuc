package case_study.common.read_writer;

import case_study.model.Room;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriterToFileRoom {
    List<Room> roomList = new ArrayList<>();
    public void writerToFileRoom(List<Room> roomList) {
        try {
            FileWriter fileWriter = new FileWriter("case_study/common/data/room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Room room : roomList) {
                bufferedWriter.write(room.getInFor1());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Room> readToFileRoom() {
        roomList=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("case_study/common/data/room.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true) {
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                String[] arr = line.split(",");

                roomList.add(new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                        Integer.parseInt(arr[4]), arr[5], arr[6]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
