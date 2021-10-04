package cz.uhk.pro2;

import cz.uhk.pro2.models.Calculator;
import cz.uhk.pro2.models.MyDbConnector;
import cz.uhk.pro2.models.MyGenericObject;
import cz.uhk.pro2.models.dataSaver.DataSaver;
import cz.uhk.pro2.models.dataSaver.FileDataSaver;
import cz.uhk.pro2.models.dataSaver.MemoryDataSaver;
import cz.uhk.pro2.models.geometry.SquareGeometryObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyDbConnector dbConnector = new MyDbConnector();
        String conn = dbConnector.getConnection();


        boolean useFile = true;
        DataSaver dataSaver;
        if(useFile)
            dataSaver = new FileDataSaver();
        else
            dataSaver = new MemoryDataSaver();

        dataSaver.save(99);
        System.out.println(dataSaver.load());

        SquareGeometryObject square = new SquareGeometryObject(5, 8);
        square.draw();
        System.out.println(square.calc());


        System.out.println("5 + 10 = " + Calculator.sum(5,10));


        MyDbConnector myConnector2 = new MyDbConnector();
        String conn2 = myConnector2.getConnection();

        System.out.println(1);
        System.out.println(1f);
        System.out.println(1d);
        System.out.println("text");


        System.out.println("5 + 10 = " + Calculator.sum(5,10));
        System.out.println("5.5 + 10.5 = " + Calculator.sum(5.5,10.5));
        System.out.println("5.5 + 10.5 + 6 = " + Calculator.sum(5.5,10.5,6));

        List<String> myList = new ArrayList<>();
        List<SquareGeometryObject> myList2 = new ArrayList<>();


        MyGenericObject<String> myGenericObject = new MyGenericObject<>("text");

        MyGenericObject<SquareGeometryObject> myGenericObject2 = new MyGenericObject<>(square);

    }
}
