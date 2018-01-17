package assignment3.abdoulkarim.cosc431.towson.edu.recyclerviewtutorial;

/**
 * Created by Karim on 1/11/2018.
 */

public class ItemClass {
    private String Heading;
    private String Desc;



    ItemClass(String Heading, String Desc){
        this.Heading=Heading;
        this.Desc=Desc;
    }

    public String getHeading() {
        return Heading;
    }

    public String getDesc() {
        return Desc;
    }

}
