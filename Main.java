package com.company;

public class Main {

    public static class Grafik{ //z2
        int x11, x12, y11, y12;
        int x21, x22, y21, y22;

        Grafik(){
            x11 = 5; y11 = 2;
            x12 = 0; y12 = -2;
            x21 = -2; y21 = 5;
            x22 = 0; y22 = -5;
        }

        public boolean testPoint(int x, int y){
            if(x <= x11 && x >= x12 && y <= y11 && y >= y12)
                return true;
            return false;
        }
    }

    public static void raschetOtrizka(int a, int b, int h){ //z3
        double[][] mas = new double[b][2];
        int count = 0, x = 0;

        for(int i = a; i <= b; i+=h)
            count++;

        for(int i = a; i <= b; i+=h) {
            mas[x][0] = i;
            mas[x][1] = Math.tan(mas[x][0]);
            x++;
        }

        for(int i = 0; i < count; i++) {
            System.out.println((int)mas[i][0] + " "+ mas[i][1]);
        }
    }

    public static double raschetPoFormyle(int x, int y) { //z1
        return (1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-((2*x)/(1+Math.pow(x,2)*Math.pow(y,2)))))+x;
    }

    public static void checkThis(int n){ //4
        int[] mas = new int[n];
        boolean flag = false;

        for(int i = 0; i < n; i++){
            mas[i] = i + 4;
            System.out.print(mas[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < n; i++){
            flag = true;
            for(int j = 2; j < mas[i]; j++)
                if(mas[i] == 0 || mas[i] == 1 || mas[i]%j == 0) {
                    flag = false;
                    break;
                }
            if(flag)
                System.out.print((i+1) + " ");
        }
    }

    public static int removedCount(){ //z5
        int[] mas = { 1,2,3,6,5,3,7,8,2,10,12};
        if (mas.length < 2) return 0;
        int result = 0;
        int prevElement = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < prevElement)
                result++;
            else {
                prevElement = mas[i];
            }
        }

        return result;
    }

    public static void strangeMas(int n){ //z6
        int[] mas = new int[n];
        int[][] masDvum = new int[n][n];

        for(int i = 0; i < n; i++)
        {
            mas[i] = i+1;
        }
        int jj = 0;
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j < n)
                    masDvum[i][j] = mas[i + j];
                if (i + j >= n) {
                    masDvum[i][j] = mas[jj];
                    jj++;
                }
            }
            jj = 0;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(masDvum[i][j] + " ");
            System.out.println("");
        }
    }

    public static void sortShella(){ //z7
        int[] mas = {1,2,4,2,6,7,1,5,9};
        int tmp = 0;
        for(int j = 0; j < mas.length; j++)
            for (int i = 0; i < mas.length - 1; i++) {
                if(mas[i]>mas[i+1]){
                    tmp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = tmp;
                }
            }
        for(int i = 0; i<mas.length; i++)
            System.out.print(mas[i]+ " ");
    }

    public static void posledovatelnosti(){ //z8
        int[] mas1 = { 1,2,3,5,7,8,10};
        int[] mas2 = { 1,2,3,4,6,8,10};

        for (int i = 0; i < mas1.length; i++) {
            if(i==0){
                if(mas1[i] >= mas2[i])
                    System.out.print("1:1");
            }else {
                System.out.println("");
                for (int j = 0; j < mas1.length; j++)
                    if(mas1[i] >= mas2[j] && mas1[i-1] <= mas2[j])
                        System.out.print((i+1) + ":" + (j+1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int a = -2;
        int b = 10;


        System.out.println("Задача1: " + raschetPoFormyle(x,y));

        Grafik graf = new Grafik();
        System.out.println("Задача2: " + graf.testPoint(1,1));

        System.out.println("Задача3: "); raschetOtrizka(a,b,2);

        System.out.println("Задача4: "); checkThis(10);

        System.out.println("\nЗадача5: " + removedCount());

        System.out.println("Задача6: "); strangeMas(5);

        System.out.println("Задача7: "); sortShella();

        System.out.println("\nЗадача8: \nПослА:ПослБ"); posledovatelnosti();
    }
}
