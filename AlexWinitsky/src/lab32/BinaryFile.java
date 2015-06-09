package lab32;

import java.io.*;


public class BinaryFile {
    public void writeFile() {

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("./src/lab32/Number.dat"))) {
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt((int) (Math.random() * 100));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream("./src/lab32/Number.dat"))) {
            int number = dataInputStream.readInt();
            for (int i = 0; i < 19; i++) {
                System.out.println(number);
                number = dataInputStream.readInt();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
