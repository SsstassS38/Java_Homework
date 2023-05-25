/////
/*Напишите метод, который вернет содержимое текущей папки в виде массива строк
 * Напишите метод, который завпишет массив, возвращенный предыдущим методом в файл 
 * ОБработайте ошибки с помощью try/ catch конструкции
 * В случае возникновения исключения, оно должно щаписаться в лог-файл. 
 */

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.lang.System.Logger;
// import java.util.logging.FileHandler;

// public class Task5 {
//     public static void main(String[] args) {
        
//     }
    
//     static void res() {
//         String[] filesPath = getFilesName("Seminar2");
//         writeToFile(filesPath);
//     }
    
//     static void writeToFile(String[] array) {
//         Logger logger = Logger.getAnonymousLogger();
//         FileHandler fileHandler = null;
//         try {
//             FileHandler fileHandler = new FileHandler("Log.txt");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//         logger.addHandler(fileHandler);    
//         try(FileWriter writer = new FileWriter("files.txt", false)) {
//             for(String s: array){
//                 writer.write(s);
//                 writer.write("/n");
//             }
//             writer.flush();
//         } catch (Exception e) {
//             logger.severe(e.toString());
//         }
//         fileHandler.close();
//     }
    
//     static String[] getFilesName(String path){
//         File file = new File(path);
//         return file.list();
//     }
// }
