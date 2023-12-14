import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.aplControl;


public class apk {
    public static void main(String[] args) {
        aplControl baru = new aplControl();
        baru.dataPengguna();
        baru.Login();
    }
}
