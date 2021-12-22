package ru.mirea.pr11;

public class Shirt
{
    private String article;
    private String title;
    private String color;
    private String size;

    public Shirt(String params)
    {
        String[] par = params.split(",");
        article = par[0];
        title = par[1];
        color = par[2];
        size = par[3];
    }

    public void printInfo()
    {
        System.out.println(article + "\n\t" + title + "\n\t" + color + "\n\t" + size);
    }
    public static void main(String[] args)
    {
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White TShirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] objs = new Shirt[shirts.length];
        int i = 0;
        for (String shirt : shirts)
            objs[i++] = new Shirt(shirt);
        for (Shirt obj : objs)
            obj.printInfo();
    }
}
