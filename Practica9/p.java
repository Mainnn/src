package Practica9;
        import java.io.*;
        import java.util.*;
public class p {
    public static void main(String arg[])throws Exception{
        File file = new File("mane1.txt");
        file.createNewFile();
        String a= " ";
        ArrayList<String> ar=new ArrayList<String>();
        FileReader Reader =new FileReader(file);
        FileWriter W= new FileWriter(file);
        System.out.println("введите предложение ");
        Scanner scn = new Scanner(System.in);
        ar.add(scn.nextLine());

        W.close();

        BufferedReader Buff =new BufferedReader(Reader);

        System.out.println(Buff.readLine());
        if(a.equals(Buff.readLine())) System.out.println("y");
        System.out.println();












        FileReader fileReader = new FileReader("mane12.txt");
        Scanner reader = new Scanner(fileReader);
        while (reader.hasNextLine()) {

            String ad = reader.nextLine();
            ar.add(ad);
            for (int  i=0;i<ar.size();i++){
                if(a.equals(ar.get(i))){
                    System.out.println("вася ты красава ваще");
                    String g=scn.nextLine();
                    ar.set(i,g);
                }


            }
            System.out.println(ar);

        }


    }

}
