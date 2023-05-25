

//                                                     Что такое API для нас: строки
// Простой пример
// Создать строку из 1 млн плюсиков. Как?
// import java.io.File;
// public class lection2 {
//     public static void main(String[] args) {
        // String str = "";                                   //решение длиннее
        // for (int i = 0; i < 1_000_000; i++) {
        //  str += "+";
        // }
        
    // var s = System.currentTimeMillis();                   //решение быстрее
    // //String str = "";
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 1_000_000; i++) {
    //     //str += "+";
    //     sb.append("+");
    // }
    // System.out.println(System.currentTimeMillis() - s);
    // System.out.println(str);
    // System.out.println(sb);
//     }
// }



//                                                              Что такое API для нас: строки

// concat(): объединение строк
// valueOf(): преобразует Object в строковое представление (завязан на toString())
// join(): объединяет набор строк в одну с учетом разделителя
// charAt(): получение символа по индексу
// indexOf(): первый индекс вхождения подстроки
// lastIndexOf(): последний индекс вхождения подстроки
// startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
// replace(): замена одной подстроки на другую
// trim(): удаляет начальные и конечные пробелы
// substring(): возвращает подстроку, см.аргументы
// toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
// сompareTo(): сравнивает две строки
// equals(): сравнивает строки с учетом регистра
// equalsIgnoreCase(): сравнивает строки без учета регистра
// regionMatches(): сравнивает подстроки в строках


//     String[] name = { "C", "е", "р", "г", "е", "й" };
//     String sk = "СЕРГЕЙ КА.";
//     System.out.println(sk.toLowerCase()); // сергей ка.
//     System.out.println(String.join("", name)); // Cергей
//     System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));
//     // C,е,р,г,е,й
//     System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));
//     }
//    }

//                                                          Работа с файловой системой
   
// Для работы нужно:
// File <имя> = new File(<полный путь к файлу>);
// File f1 = new File("file.txt");                                                      относительный путь к файлу в рамках текущей папки
// File f2 = new File("/Users/sk/vscode/java_projects/file.txt");                       абсолютный путь к файлу
// Что предпочтительнее?

    // String pathProject = System.getProperty("user.dir");
    // String pathFile = pathProject.concat("/file.txt");
    // File f3 = new File(pathFile);
    // System.out.println(f3.getAbsolutePath ());
 // /Users/sk/vscode/java_projects/file.txt
 // C:/Users/Sk/Documents/xxx/brainexplosion/java/file.txt
//     }
// }

//                                                          Работа с файловой системой. Файлы. Ошибки


// try {
//     // Код, в котором может появиться ошибка
//    } catch (Exception e) {
//     // Обработка, если ошибка случилась
//    }
//    finally {
//     // Код, который выполнится в любом случае
//    }
//         try {
//             String pathProject = System.getProperty("user.dir");
//             String pathFile = pathProject.concat("/file.txt");
//             File f3 = new File(pathFile);
//             System.out.println("try");
//             } catch (Exception e) {
//                 System.out.println("catch");
//             }
//             finally
//             { System.out.println("finally"); }
//     }
// }

//                                                                      Работа с файловой системой

// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся
// в определенном каталоге
// mkdir(): создает новый каталог
// renameTo(File dest): переименовывает файл или каталог

//                                                                      Работа с файловой системой. Каталоги


//     String pathProject = System.getProperty("user.dir");
//         String pathDir = pathProject.concat("/files");
//         File dir = new File(pathDir);
//         System.out.println(dir.getAbsolutePath ());
//         if (dir.mkdir()) {
//             System.out.println("+");
//         } else {
//             System.out.println("-");
//         }
//         for (String fname : dir.list()) {
//             System.out.println(fname);
//         } 
//     }
// }

//                                                                          Логирование

// Feb 14 1994 05:08:33 WATCHDOG: [FAUPGRADE][auto_firmware_check:(7285)]no need to upgrade firmware
// Feb 14 1994 07:03:41 ntp: start NTP update
// Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(527): eth1: Auth BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
// Feb 14 1994 10:14:02 syslog: wlceventd_proc_event(556): eth1: Assoc BC:DD:C2:88:E2:3F, status: Successful (0), rssi:0
// Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(527): eth1: Auth D4:A6:51:07:54:BB, status: Successful (0), rssi:0
// Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(556): eth1: Assoc D4:A6:51:07:54:BB, status: Successful (0), rssi:0
// Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(527): eth1: Auth D4:A6:51:01:F4:E9, status: Successful (0), rssi:0
// Feb 14 1994 10:20:20 syslog: wlceventd_proc_event(556): eth1: Assoc D4:A6:51:01:F4:E9, status: Successful (0), rssi:0
// Feb 14 1994 11:39:08 syslog: wlceventd_proc_event(491): eth1: Deauth_ind 48:3F:DA:91:19:E0, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:03:06 syslog: wlceventd_proc_event(491): eth2: Deauth_ind 18:3E:EF:E9:DF:15, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:03:08 syslog: wlceventd_proc_event(491): eth1: Deauth_ind BC:DD:C2:88:E2:3F, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:03:19 syslog: wlceventd_proc_event(491): eth2: Deauth_ind C2:D4:93:FB:9F:FB, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:03:31 syslog: wlceventd_proc_event(491): eth2: Deauth_ind FE:1F:80:6E:4B:09, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:06:34 syslog: wlceventd_proc_event(491): eth1: Deauth_ind D4:A6:51:01:F4:E9, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 13:06:34 syslog: wlceventd_proc_event(491): eth1: Deauth_ind D4:A6:51:07:54:BB, status: 0, reason: Disassociated due to inactivity (4), rssi:0
// Feb 14 1994 18:07:09 syslog: wlceventd_proc_event(527): eth1: Auth 72:34:C1:43:EC:16, status: Successful (0), rssi:0

//                                                                                              Логирование. Использование. Основы
// Использование
// Logger logger = Logger.getLogger()

// Уровни важности
// INFO, DEBUG, ERROR, WARNING и др.

// Вывод
// ConsoleHandler info = new ConsoleHandler();
// log.addHandler(info);

// Формат вывода: структурированный, абы как*
// XMLFormatter, SimpleFormatter


