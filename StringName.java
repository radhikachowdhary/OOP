import java.io.*;

class ByteArrayExample {

public static void main(String[]

args) {

byte[] nameArray = {82, 97, 100, 104, 105, 107, 97, 32, 67, 104, 111, 119, 100, 104, 97, 114, 121};
byte[] emailArray = {114, 97, 100, 104, 105, 107, 97, 64, 101, 120, 97, 109, 112, 108, 101, 46, 99, 111, 109};
String name = new

String(nameArray);

String email = new

String(emailArray);

System.out.println("Name from byte array: "+ name);

System.out.println("Email from byte array: " + email);

}

}
