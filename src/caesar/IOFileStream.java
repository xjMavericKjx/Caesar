package caesar;

import java.io.*;

public class IOFileStream {
    static String ReadFile() throws IOException{
        int i;
        String endString ="";
        System.out.println("Введите имя файла для чтения:");
        String fileName = IOStream.ReadString();
        FileInputStream fin;
        try {
            fin = new FileInputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Не верно указано имя файла");
            return null;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Слишком много слов для файла. Используйте образец: имя_файла");
            return null;
        }
        do {
            i = fin.read();
            if (i!=-1) endString+=(char)i;
        }while(i!=-1);
        fin.close();
        return endString;
    }
    static String ReadFile(String fileName) throws IOException{
        int i;
        String endString ="";
        FileInputStream fin;
        try {
            fin = new FileInputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Не верно указано имя файла");
            return null;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Слишком много слов для файла. Используйте образец: имя_файла");
            return null;
        }
        do {
            i = fin.read();
            if (i!=-1) endString+=(char)i;
        }while(i!=-1);
        fin.close();
        return endString;
    }
    static void WriteFile(String writeString) throws IOException{

        System.out.println("Введите имя файла для записи:");
        String fileName = IOStream.ReadString();
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Не верно указано имя файла");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Слишком много слов для файла. Используйте образец: имя_файла");
        }
        try{
            for(int i = 0; i < writeString.length(); i++)            {
                if (i!=-1){
                    fout.write(writeString.charAt(i));
                }
            }
        }catch (IOException e){
            System.out.println();
        }
        fout.close();
    }
    static void WriteFile(String fileName,String writeString) throws IOException{

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(fileName);
        } catch (FileNotFoundException e){
            System.out.println("Не верно указано имя файла");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Слишком много слов для файла. Используйте образец: имя_файла");
        }
        try{
            for(int i = 0; i < writeString.length(); i++)            {
                if (i!=-1){
                    fout.write(writeString.charAt(i));
                }
            }
        }catch (IOException e){
            System.out.println();
        }
        fout.close();
    }
}
