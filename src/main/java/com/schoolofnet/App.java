package com.schoolofnet;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(0, "Leonan");
        map.put(1, "Luiz");
        map.put(2, "Wesley");

        System.out.println(map.toString());
        System.out.println(map.values());
        map.remove(0);

        // Recurso para estruturar dados lista dinâmicas
//        List<String> list = new ArrayList<String>();
//
//        list.add(0, "Leonan");
//        list.add(1, "Luiz");
//        list.add(2, "Wesley");
//
//        System.out.println(list.get(1));
//        System.out.println(list.remove(1));

//        File file;
//        FileOutputStream fop = null;
//        // Duas formas de realizar leitura nesse tipo de arquivo é pelo FileInputStream e BufferedReader
//        BufferedReader reader = null;
//        FileInputStream fileReader = null;
//        BufferedInputStream bis = null;
//
//        try {
//            file = new File("test.txt");
//
//            if (file.createNewFile()) {
//                System.out.println("File is created");
//            } else {
//                System.out.println("File already exists");
//            }
//
//            fop = new FileOutputStream(file);
//
//            String text = "Hello. My name is Leonan and I'm working at School of net";
//
//            // Vetor com todos bytes dessa string
//            byte[] textBytes = text.getBytes();
//
//            // Escrever mensagem no arquivo .txt
//            fop.write(textBytes);
//            fop.flush();
//            fop.close();
//
//            System.out.println("Done");
//            System.out.println("Preparing to read...");
//
//            fileReader = new FileInputStream(file);
//            bis = new BufferedInputStream(fileReader);
//            DataInputStream dis = new DataInputStream(bis);
//
//            while (dis.available() != 0) {
//                System.out.println(dis.readLine());
//            }
//
//            fileReader.close();
//            bis.close();
//            dis.close();
//
//            // Caso ele não exista.
////            if (!file.exists()) {
////                file.createNewFile();
////            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }


//        try {
//            String currentLine;
//            // Realizar leitura do arquivo
//            reader = new BufferedReader(new FileReader("test.txt"));
//            fileReader = new FileInputStream(file);
//
//            //Exibiu mensagem do arquivo.
//            while ((currentLine = reader.readLine()) != null) {
//                System.out.println(currentLine);
//            }
//
//            if (reader != null) {
//                reader.close();
//            }
//
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }


        // Realizar o import ou a criação de arquivos
//        try {
//            File file = new File("text.txt");
//
//            if(file.createNewFile()) {
//                System.out.println("File is created");
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch(IOException ex) {
//            ex.printStackTrace();
//        }


//        Class<Public> obj = Public.class;
//
//        // Reflection
//       if (obj.isAnnotationPresent(Info.class)) {
//           Annotation annotation = obj.getAnnotation(Info.class);
//           Info info = (Info) annotation;
//
//           System.out.println(info.createdBy());
//       }


        // Classes Wrappers
        // Classes que tem a herança de Object
        // Existência dos métodos de Object.

//      |  Tipo primitivo  | Tipos Wrappers |
//      |  int             | Integer        |
//      |  boolean         | Boolean        |
//      |  double          | Double         |
//      |  float           | Float          |
//      |  long            | Long           |

//        Integer one = 0;Evolução
        // existencia dos metodos objects

        // Classe Object
        // Qualquer tipo de /objeto vem sobrescrito de Object ela e a raiz de hierarquia das classes
        // Ela sempre vai ser usada diretamente ou indiretamente.
//        Object obj = new Object();
//        Public publicCode = new Public();
//
//        System.out.println(obj.toString());
//        System.out.println(publicCode.toString());

        System.out.println("Hello World!");
    }
}
