package acrExtra;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.*;
import javax.imageio.stream.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;


public class Main {
	
    static int width = 800;
    static int height = 800;
    
    static Color darkBlue = new Color(5,56,100);
    static Color darkBrown = new Color(101, 67, 33);
    static Color softBlue = new Color(113,168,221);
    static Color darkOrange = new Color(212,60,54);
    static Color softOrange = new Color(252,109,3);
    static Color softGreen = new Color(152, 251, 152);
    static Color colorBlack = new Color(0, 0, 0);
    static Color softYellow = new Color(255, 220, 125);
  
    
    static Graphics2D g;
    

    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    // Definimos el tamaño del pixel y la matriz de colores
    private final static int PIXEL_SIZE = 40;
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);     
    	fillRect(5, 5, 7, 7, darkOrange);
    	fillRect(7, 4, 4, 1, darkOrange);
    	fillRect(6, 12, 5, 1, darkOrange);
    	fillRect(6, 4, 4, 1, darkOrange);
    	fillRect(4, 7, 1, 3, darkOrange);
    	fillRect(12, 7, 1, 3, darkOrange);
    	fillRect(7, 5, 1, 7,Color.black);
    	fillRect(9, 5, 1, 7,Color.black);
    	putPixel(10, 4,Color.black);
    	putPixel(6, 4,Color.black);
    	putPixel(6, 12,Color.black);
    	putPixel(10, 12,Color.black);
        drawSquareGrid(PIXEL_SIZE, Color.black);
        
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art1.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static void paint2() {
    	drawBackground(PIXEL_SIZE, Color.white);     
    	drawHorizontalLine(3, 13, 9, softYellow); 
    	drawHorizontalLine(4, 12, 8, softYellow);
    	drawHorizontalLine(5, 11, 7, softYellow);
    	drawHorizontalLine(6, 10, 6, softYellow);
    	drawHorizontalLine(7, 9, 5, softYellow);
    	drawHorizontalLine(8, 8, 4, softYellow);
    	drawHorizontalLine(9, 9, 5, softYellow);
    	drawHorizontalLine(10, 10, 6, softYellow);
    	drawHorizontalLine(11, 11, 7, softYellow);
    	drawHorizontalLine(12, 12, 8, softYellow);
    	drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art2.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void paint3() {
    	drawBackground(PIXEL_SIZE, Color.white);   
    	fillRect(5, 5, 7, 7, Color.yellow);
    	fillRect(7, 4, 4, 1, Color.yellow);
    	fillRect(6, 12, 5, 1, Color.yellow);
    	fillRect(6, 4, 4, 1, Color.yellow);
    	fillRect(4, 7, 1, 3, Color.yellow);
    	fillRect(12, 7, 1, 3, Color.yellow);
    	putPixel(10, 6,Color.black);
    	putPixel(6, 6,Color.black);
    	drawHorizontalLine(7, 9, 10, Color.black);
    	putPixel(10, 9,Color.black);
    	putPixel(6, 9,Color.black);
    	drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art3.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void paint4() {
    	drawBackground(PIXEL_SIZE, Color.white);     
    	fillRect(5, 5, 8, 12, softBlue);
    	fillRect(10, 5, 5, 12, softBlue);
    	drawHorizontalLine(5, 14, 6, Color.blue);
    	drawHorizontalLine(6, 13, 5, Color.blue);
    	drawHorizontalLine(6, 13, 7, Color.blue);
    	drawHorizontalLine(7, 12, 4, Color.blue);
    	drawHorizontalLine(7, 12, 8, Color.blue);
    	drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art4.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void paint5() {
    	drawBackground(PIXEL_SIZE, Color.white);   
    	drawHorizontalLine(4, 10, 3, Color.red); 
    	drawHorizontalLine(3, 11, 4, Color.red);
    	drawHorizontalLine(3, 11, 5, Color.red);
    	drawHorizontalLine(3, 11, 6, Color.red);
    	drawHorizontalLine(4, 10, 7, Color.red);
    	drawHorizontalLine(4, 10, 8, Color.red);
    	drawHorizontalLine(5, 9, 9, Color.red);
    	drawHorizontalLine(6, 8, 10, Color.red);
    	drawHorizontalLine(7, 7, 11, Color.red);
    	putPixel(7, 3,Color.white);
    	drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art5.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void paint6() {
    	drawBackground(PIXEL_SIZE, Color.white);   
    	fillRect(5, 5, 7, 7, Color.yellow);
    	fillRect(7, 4, 4, 1, Color.yellow);
    	fillRect(6, 12, 5, 1, Color.yellow);
    	fillRect(6, 4, 4, 1, Color.yellow);
    	fillRect(4, 7, 1, 3, Color.yellow);
    	fillRect(12, 7, 1, 3, Color.yellow);
    	putPixel(10, 6,Color.black);
    	putPixel(6, 6,Color.black);
    	drawHorizontalLine(7, 9, 10, Color.black);
    	putPixel(9, 11,Color.black);
    	putPixel(7, 11,Color.black);
    	putPixel(6, 7,softBlue );
    	putPixel(10, 7,softBlue );
    	drawSquareGrid(PIXEL_SIZE, Color.black);
        try {       
            ImageIO.write(image, "jpg", new File("pixel_art6.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void drawVerticalLine(int a, int b, int x, Color c){
    	for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
        for(int i=a;i<=b;i++){
     	   g.setColor(c);
           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
        }
    }
    
    private static void fillRect(int x, int y, int width, int height, Color c){
    	g.setColor(c);
    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
    }
    
    private static void drawSquareGrid(int size, Color c) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {                
                g.setColor(c);
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void putPixel(int x, int y, Color c){       
 	   g.setColor(c);
 	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
     }
    
    private static void drawBackground(int size, Color c) {
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.setColor(c);
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }
    
    
    public static void main(String[] args) {
    	g = image.createGraphics();
            paint();
            paint2();
            paint3();
            paint4();
            paint5();
            paint6();

            // Write the images into a GIF file
            try {
 
                System.out.println("GIF created successfully!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        
}

