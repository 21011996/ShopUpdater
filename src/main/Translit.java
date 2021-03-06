package main;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.*;

public class Translit {
    private static final String[] charTable = new String[65536];
    static {
        charTable['А'] = "A";
        charTable['Б'] = "B";
        charTable['В'] = "V";
        charTable['Г'] = "G";
        charTable['Д'] = "D";
        charTable['Е'] = "E";
        charTable['Ё'] = "E";
        charTable['Ж'] = "ZH";
        charTable['З'] = "Z";
        charTable['И'] = "I";
        charTable['Й'] = "I";
        charTable['К'] = "K";
        charTable['Л'] = "L";
        charTable['М'] = "M";
        charTable['Н'] = "N";
        charTable['О'] = "O";
        charTable['П'] = "P";
        charTable['Р'] = "R";
        charTable['С'] = "S";
        charTable['Т'] = "T";
        charTable['У'] = "U";
        charTable['Ф'] = "F";
        charTable['Х'] = "H";
        charTable['Ц'] = "C";
        charTable['Ч'] = "CH";
        charTable['Ш'] = "SH";
        charTable['Щ'] = "SH";
        charTable['Ъ'] = "'";
        charTable['Ы'] = "Y";
        charTable['Ь'] = "";
        charTable['Э'] = "E";
        charTable['Ю'] = "U";
        charTable['Я'] = "YA";

        for (int i = 0; i < charTable.length; i++) {
            char idx = (char) i;
            char lower = new String(new char[] {idx}).toLowerCase().charAt(0);
            if (charTable[i] != null) {
                charTable[lower] = charTable[i].toLowerCase();
            }
        }
    }

    public static String toTranslit(String text) {
        char charBuffer[] = text.toCharArray();
        StringBuffer sb = new StringBuffer(text.length());
        for (int i = 0; i < charBuffer.length; i++) {
            String replace = charTable[charBuffer[i]];
            if (replace == null) {
                if (isDigit(charBuffer[i]) || isLetter(charBuffer[i])) {
                    sb.append(charBuffer[i]);
                } else if (isSpaceChar(charBuffer[i])){
                    sb.append('-');
                }
            } else {
                sb.append(replace);
            }
        }
        return sb.toString();
    }
}