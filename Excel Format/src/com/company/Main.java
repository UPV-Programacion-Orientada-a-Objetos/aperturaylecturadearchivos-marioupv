package com.company;
import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;

public class Main {

    public static  void main(String[] args) throws Exception {
        //String titulo;
        String[] Datos = new String[4];
        String[][] Horario = new String[15][10];

        System.out.println("Hola mundo jeje");
        FileInputStream file = new FileInputStream("LibroP.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet hoja = wb.getSheetAt(0);
        System.out.println(hoja.getLastRowNum());
        XSSFRow fila = hoja.getRow(1);
        for (int i = 0; i <= 3; i++) {

            XSSFCell celda = fila.getCell(i);
           // System.out.println("Valor en la posicion i " + i + " = " + celda);
            if (celda == null) {
                Datos[i] = ("Carrarter no reconocible");
            } else {
                Datos[i] = celda.getStringCellValue();
            }
        }
        System.out.println("Los datos del profesor son: ");

        for (int i = 0; i < Datos.length; i++) {
            switch (i){
                case 0:
                    System.out.print("Nombre: ");
                    System.out.println(Datos[i]);
                    break;
                case 1:
                    System.out.print("Correo: ");
                    System.out.println(Datos[i]);
                    break;
                case 2:
                    System.out.print("Carrera: ");
                    System.out.println(Datos[i]);
                    break;
                case 3:
                    System.out.print("Tipo de horario: ");
                    System.out.println(Datos[i]);
                    break;
            }
        }

        for (int i = 0; i <= hoja.getLastRowNum(); i++) {
            fila = hoja.getRow(i);
            for (int j = 4; j < fila.getLastCellNum(); j++) {
                XSSFCell celda = fila.getCell(j);
                //System.out.println("i= "+i+"j = "+(j-4)+celda);
                if (celda == null) {
                    Horario[i][j-4] = ("Carrarter no reconocible");
                } else {
                    Horario[i][j] = celda.getStringCellValue();
                }
            }
        }


        for (int i = 0; i < 15; i++) {
            for (int j = 4; j < 10; j++) {
                System.out.print(Horario[i][j]+"    ");
            }
            System.out.println();
        }
    }

}



