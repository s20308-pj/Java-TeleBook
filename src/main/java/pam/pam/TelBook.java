package pam.pam;

import java.util.Map;
import java.util.TreeMap;

public class TelBook {
    public static void main(String[] args) {
        boolean exit = false;
        Map<String, Contact> book = new TreeMap<>();

        do {
            switch (ProgramOptions.fromId(Input.fromKeybordInt())) {

                case ProgramOptions.NAME_SEARCH:
                    Logic.print(ProgramOptions.NAME_SEARCH.getDescription());
                    Logic.nameSearch(Input.fromKeybordString());
                    break;
                case ProgramOptions.NUMBER_SEARCH:
                    Logic.print(ProgramOptions.NUMBER_SEARCH.getDescription());
                    Logic.numberSearch(Input.fromKeybordString());
                    break;
                case ProgramOptions.ADD_NEW:
                    Logic.addNew(Input.fromKeybordString());
                    break;
                case ProgramOptions.DELETE:
                    Logic.delete(Input.fromKeybordString());
                    break;
                case ProgramOptions.EXIT:
                    exit = true;
                    break;
                default:
                    System.out.println("nie ma takiego znaku");
            }
        }while (exit);
    }
}
