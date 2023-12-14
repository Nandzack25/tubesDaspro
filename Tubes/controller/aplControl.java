package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

import model.Akun;
import model.DetilTransaksi;
import model.PaketData;
import model.Pengguna;
import model.Transaksi;

public class aplControl {
    HashMap<String, PaketData> PaketDatas = new HashMap();
    ArrayList<Transaksi> Transaksis = new ArrayList<>();
    HashMap<String, Pengguna> Penggunas = new HashMap<>();

    int HashMapCount = 2;

    Pengguna pengguna1 = new Pengguna();
    Pengguna pengguna2 = new Pengguna();

    PaketData paketData1 = new PaketData();
    PaketData paketData2 = new PaketData();
    

    public void dataPengguna(){
        

        pengguna1.setIdPengguna("1").setName("madda").setnoHp("0812121212").setEmail("madda@gmail.com").setPassword("123");
        pengguna2.setIdPengguna("2").setName("nanda").setnoHp("0823232323").setEmail("nanda@gmail.com").setPassword("123");

        Penggunas.put(pengguna1.getIdPengguna(),pengguna1);
        Penggunas.put(pengguna2.getIdPengguna(),pengguna2);
    }


    public void Login(){
        dataPengguna();
        Scanner input = new Scanner(System.in);
        String index ="" ;
        boolean lanjut = true;
        while(lanjut == true){
            for(int i = 1;i <= HashMapCount;i++) {
                System.out.println("Masukan nomer HP:");
                String no = input.nextLine();
                if(Penggunas.get(String.valueOf(i)).getnoHp().equals(no)  ){
                index = String.valueOf(i);
                System.out.println("masukan password");
                String pw = input.nextLine();

                    if(Penggunas.get(index).getPassword().equals(pw)){
                         System.out.println("berhasil login");
                         lanjut = false;
                     }
                    else{
                         System.out.println("password salah");
                     }
                }
                else{
                    System.out.println("Nomer handphone tidak terdaftar");
                }   
            }
        }
    }
  
        
    
}

