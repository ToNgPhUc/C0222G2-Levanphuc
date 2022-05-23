package case_study.text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class a {


    public static class ReadAndWrite {
       // public void cachLamGhiFileMap(){

//                houseList.put(new House(serviceCodeHouse,serviceNameHouse,areaHouse,rentalCostsHouse
//                        ,maximumNumberOfPeopleDaHouse,rentalTypeHouse,roomStandardHouse,numberOfFloorsHouse),1);
//                readWriterToFileHouse.writerToFileHouse(houseList);
//        }
//public class ReadWriterToFileHouse {
//    static Map<House, Integer> houseList = new LinkedHashMap<>();
//    static List<String> stringList = new ArrayList<>();
//
//    public void writerToFileHouse(Map<House, Integer> houseList) {
//        try {
//            FileWriter fW = new FileWriter("case_study/bai_1/common/data/house.csv", false);
//            BufferedWriter bW = new BufferedWriter(fW);
//            for (Map.Entry<House, Integer> entry : houseList.entrySet()) {
//                stringList.add(entry.getKey().getInFor1() + "," + entry.getValue());
//            }
//            for (String s : stringList) {
//                bW.write(s);
//                bW.newLine();
//            }
//
//            bW.close();
//            fW.close();
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
//
//    public Map<House, Integer> readToFileHouse() {
//
//        try {
//            FileReader fd = new FileReader("case_study/bai_1/common/data/house.csv");
//            BufferedReader br = new BufferedReader(fd);
//            String line = "";
//            while (true) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                }
//                String[] arr = line.split(",");
//                houseList.put(new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
//                        Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[7])), Integer.parseInt(arr[8]));
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return houseList;
//    }
//}




















        //        private final static String PATH_STUDENT = "src\\ss4_class_object\\student_manager1\\data\\student.csv";
//        private final static String PATH_TEACHER = "src\\ss4_class_object\\student_manager1\\data\\teacher.csv";
//        // cách 1
//        public static void writeStudentToCSV(List<Student> studentList,Boolean flag){
//            File file = new File(PATH_STUDENT);
//            FileWriter fileWriter =null;
//            BufferedWriter bufferedWriter = null;
//            try {
//                fileWriter = new FileWriter(file,flag);
//                bufferedWriter =new BufferedWriter(fileWriter);
//                for (Student student: studentList) {
//                    bufferedWriter.write(student.getInfoToCSV());
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // cách 2
// viết hàm chung
        private static void writeDatToCSV(List<String> stringList, String pathFile, Boolean flag) {
            File file = new File(pathFile);
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            try {
                fileWriter = new FileWriter(file, flag);
                bufferedWriter = new BufferedWriter(fileWriter);
                for (String string : stringList) {
                    bufferedWriter.write(string);
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // hàm riêng têacher
//        public static void writeTeachertToCSV1(List<Teacher> teacherList, Boolean flag) {
//            List<String> stringList = new ArrayList<>();
//            for (Teacher teacher : teacherList) {
//                stringList.add(teacher.toString());
//            }
//            writeDatToCSV(stringList, PATH_TEACHER, flag);
//        }

//        // hàm riêng student
//        public static void writeStudentToCSV1(List<Student> studentList, Boolean flag) {
//            List<String> stringList = new ArrayList<>();
//            for (Student student : studentList) {
//                stringList.add(student.getInfoToCSV());
//            }
//            writeDatToCSV(stringList, PATH_STUDENT, flag);
//        }


        //cách 1
//        public static List<Student> readFileCsvToListStudent() {
//            List<Student> studentList = new ArrayList<>();
//            File file = new File(PATH_STUDENT);
//            FileReader fileReader = null;
//            BufferedReader bufferedReader = null;
//            try {
//                fileReader = new FileReader(file);
//                bufferedReader = new BufferedReader(fileReader);
//                String line = null;
//                String[] array = null;
//                Student student = null;
//                while ((line = bufferedReader.readLine()) != null) {
//                    array = line.split(",");
//                    student = new Student(Integer.parseInt(array[0]), array[1],
//                            array[2], Integer.parseInt(array[3]));
//                    studentList.add(student);
//                }
//                bufferedReader.close();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return studentList;
//        }
        // cách 2 hàm chung
        private static List<String> readFileCsvToListStrinng(String pathFile) {
            List<String> stringList = new ArrayList<>();
            File file = new File(pathFile);
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                String line = null;
                while (true) {
                    try {
                        if (!((line = bufferedReader.readLine()) != null)) break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    stringList.add(line);
                }
                bufferedReader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringList;
        }
//        public static List<Student> readFileCsvToListStudent1() {
//            List<String> stringList = readFileCsvToListStrinng(PATH_STUDENT);
//            List<Student> studentList = new ArrayList<>();
//            String[] array = null;
//            Student student = null;
//            // chuyển listString => listStudent
//            for (String str: stringList) {
//                array = str.split(",");
//                student = new Student(Integer.parseInt(array[0]), array[1],
//                        array[2], Integer.parseInt(array[3]));
//                studentList.add(student);
//            }
//            return studentList;
//        }
    }
}
