
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class PhoneBook {
    private Map<String,ArrayList> book = new HashMap<String, ArrayList>();
    ArrayList<String> phne;

    public PhoneBook(){

        ArrayList<String> phneIvanov = new ArrayList<String>();
        ArrayList<String> phnePetrov = new ArrayList<String>();
        ArrayList<String> phneSidorov = new ArrayList<String>();

        phneIvanov.add("+780032547885");
        book.put("Иванов", phneIvanov);

        phnePetrov.add("+8563149845");
        phnePetrov.add("+8563149999");
        book.put("Петров", phnePetrov);

        phneSidorov.add("+8522345485");
        phneSidorov.add("+88412222354");
        phneSidorov.add("+88005552525");
        book.put("Сидоров", phneSidorov);

    }

    public void printPhoneLst(String FIO) throws java.io.UnsupportedEncodingException
    {
        PrintStream printStream = new PrintStream(System.out, true, "Cp866");

        if (book.containsKey(FIO))
        {

            phne = book.get(FIO);

            if (!phne.isEmpty()) {
                for (String s : phne) {
                    System.out.println(s);
                }
            }
            else {
                printStream.println("Не найдены записи в справочнике для ФИО = "+FIO);
            }
        }

        else {
            printStream.println("В справочнике отсутствует ФИО = "+FIO);
        }
    }
}
