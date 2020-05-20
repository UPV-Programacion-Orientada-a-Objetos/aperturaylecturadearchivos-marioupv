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
        String  [] Datos = new String[10];
        System.out.println("Hola mundo jeje");
        FileInputStream file = new FileInputStream("LibroP.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet hoja = wb.getSheetAt(0);
        System.out.println(hoja.getLastRowNum());
        XSSFRow fila = hoja.getRow(1);
       for ( int i = 0 ; i <= hoja.getLastRowNum() ; i ++ ) {

           XSSFCell celda = fila.getCell(i);
           System.out.println("Valor en la posicion i "+i+" = "+celda);
           int c ;
           /*for (c = 0; c < fila.getLastCellNum(); c++) {
               Datos[c] = celda.getStringCellValue();

           }*/
       }
           // System.out.println("Valor en la posicion i "+i+" = "+celda);
           // System.out.println("Valor en la posicion "+c+" = "+Datos[c]);
          /*  if(celda==null){

                Datos[i]=("Carrarter no reconocible");
            }else {
                Datos[i] = celda.getStringCellValue();
            }*/
        //}
        for (int c=0; c<Datos.length;c++){
            System.out.println("Valor en la posicion c"+c+" = "+Datos[c]);
        }

    }


}



