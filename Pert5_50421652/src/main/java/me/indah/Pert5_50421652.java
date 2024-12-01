package me.indah;

import me.indah.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Pert5_50421652 implements CommandLineRunner{
    
    @Autowired
    private MahasiswaController mhsController;

    public static void main(String[] args) {
        SpringApplication.run(Pert5_50421652.class, args);
    }
    
    @Override
    public void run(String... args)throws Exception {
        mhsController.tampilkanMenu();
    }
}